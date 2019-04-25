package me.destro.android.spinkit_samples;

import androidx.databinding.DataBindingUtil;
import androidx.core.content.ContextCompat;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.github.ybq.android.spinkit.style.Wave;
import me.destro.android.spinkit_samples.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private Wave waveDrawable;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        waveDrawable = new Wave();
        waveDrawable.setBounds(0, 0, 100, 100);
        waveDrawable.setColor(ContextCompat.getColor(this, R.color.colorAccent));

        binding.tv.setCompoundDrawables(waveDrawable, null, null, null);

    }

    @Override
    protected void onResume() {
        super.onResume();

        waveDrawable.start();
    }

    @Override
    protected void onStop() {
        super.onStop();

        waveDrawable.stop();
    }
}
