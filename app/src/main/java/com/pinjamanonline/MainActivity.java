package com.pinjamanonline;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Input(View view)
    {
        startActivity(new Intent(getApplicationContext(), Input.class));
        finish();
    }

    public void ListData(View view)
    {
        startActivity(new Intent(getApplicationContext(), list.class));
        finish();
    }

    public void SignOut(View view)
    {
        startActivity(new Intent(getApplicationContext(), LogOut.class));
        finish();
    }

    public void upload(View view)
    {
        startActivity(new Intent(getApplicationContext(), uploadimage.class));
        finish();
    }
}