package com.example.eventhandlingdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button myButton=(Button)findViewById(R.id.myButton);
        myButton.setOnClickListener(new Button.OnClickListener(){

            @Override
            public void onClick(View v) {
             EditText myText=findViewById(R.id.myText);
             myText.setText("How are You Today?");
            }
        });
    }
}
