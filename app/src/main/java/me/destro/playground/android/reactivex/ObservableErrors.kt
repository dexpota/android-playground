package me.destro.playground.android.reactivex

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.jakewharton.rxbinding3.view.clicks
import io.reactivex.Observable
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.subjects.PublishSubject
import me.destro.playground.android.R
import me.destro.playground.android.databinding.ActivityObservableErrorsBinding
import kotlin.random.Random

class ObservableErrors : AppCompatActivity() {
    private val tag = ObservableErrors::class.java.simpleName

    private val requestData = PublishSubject.create<Unit>()

    private val dataSource = requestData.flatMap { Observable.fromCallable { Random.nextInt() } }

    private val disposer = CompositeDisposable()

    private lateinit var binding: ActivityObservableErrorsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_observable_errors)

        dataSource.subscribe(this::onDataSourceNext, this::onDataSourceError)
            .let { disposer.add(it) }

        binding.generate.clicks()
            .subscribe(this::onRequestNextData)
            .let { disposer.add(it) }
    }

    override fun onDestroy() {
        super.onDestroy()

        if (!disposer.isDisposed)
            disposer.dispose()
    }

    private fun onRequestNextData(unit: Unit) {
        requestData.onNext(unit)
    }

    private fun onDataSourceNext(item: Int) {
        Log.d(tag, "Data received: $item")
    }

    private fun onDataSourceError(error: Throwable) {

    }
}