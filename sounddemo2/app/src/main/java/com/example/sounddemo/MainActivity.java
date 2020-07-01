package com.example.sounddemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.media.MediaPlayer;
import android.view.View;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mPlayer=MediaPlayer.create(this, R.raw.laugh);
        SeekBar volumeControl= (SeekBar)findViewById(R.id.seekBar);
        volumeControl.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener(){
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }

    public void playAudio(View view)
    {

        mPlayer.start();
    }

    public void pauseAudio(View view)
    {
      mPlayer.pause();
    }
}
