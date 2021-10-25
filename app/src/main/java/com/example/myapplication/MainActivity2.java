package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        System.out.println("123");
    }

    public void SignInClick(View view) {

        final String login;
        final String password;
        boolean Done = true;

        SharedPreferences mSettings;
        mSettings = getSharedPreferences("FILE_CASH", MODE_PRIVATE);

        //read
        final boolean loginLive = mSettings.contains("login");
        final boolean passwordLive = mSettings.contains("password");
        if(!loginLive || !passwordLive){
            Done = false;
        }
        else {
            login = mSettings.getString("login", "");
            password = mSettings.getString("password", "");

            EditText LoginTextEdit;
            LoginTextEdit = findViewById(R.id.editTextTextPersonName);
            final String LoginText = LoginTextEdit.getText().toString();
            EditText PasswordTextEdit;
            PasswordTextEdit = findViewById(R.id.editTextTextPassword2);
            final String PasswordText = PasswordTextEdit.getText().toString();

            if (!login.equals(LoginText) || !password.equals(PasswordText)) {
                Done = false;
            }
        }

        if (Done){
            Intent i = new Intent(this, Menu.class);
            startActivity(i);
            finish();
        }
        else {
            Toast.makeText(this, "Password or login entered incorrectly", Toast.LENGTH_SHORT).show();
        }
    }

    public void RegistrationClick(View view) {
        Intent i = new Intent(this, Registration.class);
        startActivity(i);
        finish();
    }


}

