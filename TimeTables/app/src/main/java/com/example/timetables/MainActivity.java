package com.example.timetables;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SeekBar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView timesTableListView;
    public void generateTimesTable(int timesTable)
    {

        ArrayList<String> timesTableContent = new ArrayList<String>();
        for(int i=1;i<=timesTable;i++)
        {
            timesTableContent.add(Integer.toString(i*timesTable));
        }
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,timesTableContent);
        timesTableListView.setAdapter(arrayAdapter);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SeekBar timesTableSeekbar = (SeekBar) findViewById(R.id.timesTableSeekbar);
        timesTableListView = (ListView)findViewById(R.id.timesTableListView);
        timesTableSeekbar.setMax(20);
        timesTableSeekbar.setProgress(10);
        timesTableSeekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                int min=1;
                int timesTable;
                if(progress < min)
                {
                    timesTable =1;
                }
                else
                {
                    timesTable=progress;
                }
                generateTimesTable(timesTable);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        generateTimesTable(10);
    }
}
