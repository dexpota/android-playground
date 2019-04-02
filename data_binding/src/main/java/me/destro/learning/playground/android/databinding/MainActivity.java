package me.destro.learning.playground.android.databinding;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import me.destro.learning.playground.android.databinding.model.ObservableUser;
import me.destro.learning.playground.android.databinding.databinding.ActivityMainBinding;
import me.destro.learning.playground.android.databinding.model.User;
import me.destro.learning.playground.android.databinding.reactions.UserReaction;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        List<String> hobbies = Arrays.asList(null, "elettronica", "informatica");
        // In this case if hobbies is null nothing bad happens.
        User user = new User("Fabrizio", "Destro", null, hobbies);
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
}
