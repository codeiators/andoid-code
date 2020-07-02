package com.example.sounddemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.media.AudioManager;
import android.os.Bundle;
import android.media.MediaPlayer;
import android.util.Log;
import android.view.View;
import android.widget.SeekBar;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mPlayer;
    AudioManager audioManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mPlayer=MediaPlayer.create(this, R.raw.laugh);
        audioManager = (AudioManager)getSystemService(Context.AUDIO_SERVICE);
        int maxVolume=audioManager.getStreamMaxVolume(AudioManager.STREAM_MUSIC);
        int curVolume=audioManager.getStreamVolume(AudioManager.STREAM_MUSIC);
        SeekBar volumeControl= (SeekBar)findViewById(R.id.seekBar);
        volumeControl.setMax(maxVolume);
        volumeControl.setProgress(curVolume);

        volumeControl.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener(){
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                Log.i("SeekBar Value",Integer.toString(progress));
                audioManager.setStreamVolume(AudioManager.STREAM_MUSIC,progress,0);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        final SeekBar scrubber= (SeekBar)findViewById(R.id.seekBar1);
        scrubber.setMax(mPlayer.getDuration());
        new Timer().scheduleAtFixedRate(new TimerTask(){

            @Override
            public void run() {
             scrubber.setProgress(mPlayer.getCurrentPosition());
            }
        },0,1000);
        scrubber.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener(){

                                                @Override
                                                public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

                                                }

                                                @Override
                                                public void onStartTrackingTouch(SeekBar seekBar) {

                                                }

                                                @Override
                                                public void onStopTrackingTouch(SeekBar seekBar) {

                                                }
                                            }
        );
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
