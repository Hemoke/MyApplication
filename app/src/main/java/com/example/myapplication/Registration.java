package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class Registration extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
    }

    public void RegistrationClick(View view){

        EditText LoginField =findViewById(R.id.editTextTextPersonName);
        EditText PasswordField = findViewById(R.id.editTextTextPassword2);

        SharedPreferences Settings = getSharedPreferences("FILE_CASH", MODE_PRIVATE);
        SharedPreferences.Editor Editor = Settings.edit();

        String LoginText = LoginField.getText().toString();
        String PasswordText = PasswordField.getText().toString();
        if (LoginText == "" || PasswordText == ""){
            Toast.makeText(this, "fill in the fields", Toast.LENGTH_SHORT).show();
        }
        else {
            Editor.putString("login", LoginText);
            Editor.putString("password", PasswordText);
            Editor.apply();

            Intent i = new Intent(this, Menu.class);
            startActivity(i);
            finish();
        }
    }




    }