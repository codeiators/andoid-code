package com.example.textfield_demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void getText(View view)
    {

    EditText myTextField = (EditText)findViewById(R.id.myTextField);
        Toast.makeText(MainActivity.this, myTextField.getText().toString(), Toast.LENGTH_SHORT).show();
    Log.i("Info",myTextField.getText().toString());
    }
}
