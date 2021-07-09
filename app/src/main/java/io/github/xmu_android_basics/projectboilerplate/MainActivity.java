package io.github.xmu_android_basics.projectboilerplate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import io.github.xmu_android_basics.projectboilerplate.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding _binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        _binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(_binding.getRoot());
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        _binding = null;
    }
}