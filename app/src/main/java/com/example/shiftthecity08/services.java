package com.example.shiftthecity08;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class services extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_services);
    }

    public void officeshifting(View view)
    {
        Intent intent =new Intent(services.this,officeshifting.class);
        startActivity(intent);
    }

    public void houseshifting(View view)
    {
        Intent intent =new Intent(services.this,houseshifting.class);
        startActivity(intent);
    }

    public void furnitureshifting(View view)
    {
        Intent intent =new Intent(services.this,furnitureshifting.class);
        startActivity(intent);
    }
}