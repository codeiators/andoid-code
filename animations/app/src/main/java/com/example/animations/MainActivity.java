package com.example.animations;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void fade(View view)
    {
     ImageView homer = (ImageView)findViewById(R.id.homer);
        ImageView bart = (ImageView)findViewById(R.id.bart);
     homer.animate().alpha(0f).setDuration(2000);
        bart.animate().alpha(1f).setDuration(2000);
    }
}
