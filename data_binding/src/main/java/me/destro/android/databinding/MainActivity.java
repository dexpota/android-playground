package me.destro.android.databinding;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import me.destro.android.databinding.model.ObservableUser;
import me.destro.android.databinding.databinding.ActivityMainBinding;
import me.destro.android.databinding.model.User;
import me.destro.android.databinding.reactions.UserReaction;
import org.joda.time.LocalDateTime;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        // TODO move this into a repo
        ArchitectureApplication.Companion.getTypicodeApi().users()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe((users) -> {
                    if (users.size() > 0)
                        binding.setUser(convert(users.get(0)));
                });

        List<String> hobbies = Arrays.asList(null, "elettronica", "informatica");
        // In this case if hobbies is null nothing bad happens.
        LocalDateTime now = LocalDateTime.now();
        User user = new User(0,"Fabrizio", "Destro", null, now.toDate(), hobbies);
        UserReaction reaction = new UserReaction();

        ObservableUser observableUser = new ObservableUser();
        observableUser.setFirstName("Tizio");
        observableUser.setLastName("Caio");

        // If the value is null, is not a problem. In this case no values will be displayed.
        //binding.setUser(null);

        binding.setUserReaction(reaction);
        binding.setUser(user);
        binding.setObservableUser(observableUser);
    }

    // TODO this is a data mapping functionality, move it from here
    private User convert(me.destro.android.core.api.typicode.model.User user) {
        LocalDateTime now = LocalDateTime.now();
        return new User(user.getId(), user.getName(), "Missing", user.getUsername(), now.toDate(), null);
    }
}
