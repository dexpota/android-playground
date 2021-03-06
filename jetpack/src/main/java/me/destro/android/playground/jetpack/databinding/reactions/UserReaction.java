package me.destro.android.playground.jetpack.databinding.reactions;

import android.util.Log;
import android.view.View;
import me.destro.android.playground.jetpack.databinding.model.ObservableUser;
import me.destro.android.playground.jetpack.databinding.model.User;

public class UserReaction {
    private static final String TAG = UserReaction.class.getSimpleName();

    public void onSurnameClicked(View view) {
        Log.d(TAG, "onClick called.");
    }

    public void onNameClicked(User user) {
        user.setName("Non puoi cambiare nome.");
        Log.d(TAG, String.format("You clicked the user with name %s", user.getName()));
    }

    public void onSurnameClicked(ObservableUser observableUser) {
        observableUser.setLastName("Così vorresti cambiare cognome?");
        Log.d(TAG, String.format("You clicked the user with surname %s", observableUser.getLastName()));
    }
}
