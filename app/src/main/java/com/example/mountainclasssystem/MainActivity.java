package com.example.mountainclasssystem;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Mountain m = new Mountain(304, "Billingen", "Skövde");
        Log.d("enTagg", m.getName());
    }
}
