package com.example.shiftthecity08;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class officeshifting extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_officeshifting);
    }

    public void normalofficeshifting(View view)
    {
        Intent intent=new Intent(officeshifting.this,normaloffice.class);
        startActivity(intent);
    }
}