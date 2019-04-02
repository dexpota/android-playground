package me.destro.learning.playground.android.databinding.model

import android.databinding.BaseObservable
import android.databinding.Bindable
import me.destro.learning.playground.android.databinding.BR

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