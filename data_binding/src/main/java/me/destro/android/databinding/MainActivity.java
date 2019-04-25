package me.destro.android.databinding;

import android.content.Intent;
import androidx.databinding.DataBindingUtil;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import me.destro.android.databinding.basic.BasicActivity;
import me.destro.android.databinding.databinding.ActivityExamplesBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityExamplesBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_examples);


        binding.basic.getRoot().setOnClickListener(view -> {
            Intent intent = new Intent(this, BasicActivity.class);
            startActivity(intent);
        });

        binding.basic.title.setText(R.string.basic_example_title);
        binding.basic.description.setText(R.string.basic_example_description);
    }
}