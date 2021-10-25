package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void DepartamentsOnClick(View view) {
        Intent i = new Intent(this, Departments.class);
        startActivity(i);
    }

    public void WantedOnClick(View view) {
        Intent i = new Intent(this, Wanted.class);
        startActivity(i);
    }
    public void PhotoRobotOnClick(View view) {
        Intent i = new Intent(this, PhotoRobot.class);
        startActivity(i);
    }
}


