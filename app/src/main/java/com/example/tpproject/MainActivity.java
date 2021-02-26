package com.example.tpproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private MaterialButton clientUser, salonUser, administratorUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        clientUser = findViewById(R.id.btn_client_Sign_In);
        clientUser.setOnClickListener(this);

        salonUser = findViewById(R.id.btn_salons_Sign_In);
        salonUser.setOnClickListener(this);

        administratorUser = findViewById(R.id.btn_administrator_Sign_In);
        administratorUser.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if (view == clientUser) {
            Toast.makeText(this, "Clicked clientUser", Toast.LENGTH_SHORT).show();
            //start activity here
        } else if (view == salonUser) {
            Toast.makeText(this, "Clicked salonUser", Toast.LENGTH_SHORT).show();
            //start activity here
        } else if (view == administratorUser) {
            Toast.makeText(this, "Clicked administratorUser", Toast.LENGTH_SHORT).show();
            //start activity here
        }
    }
}