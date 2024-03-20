package com.example.notes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.notes.databinding.ActivityMainBinding;
import com.example.notes.fragment.MainFragment;

import kotlin.Pair;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    private static int SPLASH_SCREEN_DELAY = 3000;

    Handler handler = new Handler();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        TextView tvscreen = findViewById(R.id.tvscreen);
        ImageView ivscreen = findViewById(R.id.lottie);


        tvscreen.animate().translationX(1000).setDuration(1000).setStartDelay(2500);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
              Intent intent = new Intent(MainActivity.this, MainFragment.class);
                startActivity(intent);
                finish();

                Pair[] pairs = new Pair[2];
                pairs[0] = new Pair<>(ivscreen, "logo_image");
                pairs[1] = new Pair<>(tvscreen, "logo_text");


            }
        },SPLASH_SCREEN_DELAY);

    }
}