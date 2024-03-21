package com.example.notes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

import com.example.notes.databinding.ActivityMainBinding;
import com.example.notes.fragment.MainFragment;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());
        Fragment mainFragment = new MainFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.container,mainFragment).commit();
    }
}