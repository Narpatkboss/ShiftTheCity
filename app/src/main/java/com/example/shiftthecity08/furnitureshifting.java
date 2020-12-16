package com.example.shiftthecity08;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class furnitureshifting extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_furnitureshifting);
    }

    public void gotofurnitureshifting(View view)
    {
        Intent intent=new Intent(furnitureshifting.this,furnitureshiftingdash.class);
        startActivity(intent);
    }
}