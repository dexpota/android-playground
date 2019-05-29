package me.destro.android.playground.jetpack.databinding.model

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import me.destro.android.databinding.BR

class ObservableUser : BaseObservable() {
    @get:Bindable
    var firstName: String = ""
        set(value) {
            field = value
            notifyPropertyChanged(BR.observableUser)
        }

    @get:Bindable
    var lastName: String = ""
        set(value) {
            field = value
            notifyPropertyChanged(BR.lastName)
        }
}