package me.destro.android.playground.jetpack.databinding.basic;

import androidx.lifecycle.ViewModel;
import io.reactivex.Single;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import me.destro.android.core.api.typicode.model.User;
import me.destro.android.playground.jetpack.databinding.ArchitectureApplication;

import java.util.List;

public class BasicActivityViewModel extends ViewModel {

    Single<List<User>> requestUsers() {
        // TODO move this into a repo
        return ArchitectureApplication.Companion.getTypicodeApi().users()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());
    }
}
