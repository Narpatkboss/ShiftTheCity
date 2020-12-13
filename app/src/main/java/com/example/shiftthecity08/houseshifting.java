package com.example.shiftthecity08;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class houseshifting extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_houseshifting);
    }




    public void goto1bhk(View view)
    {
        Intent intent=new Intent(houseshifting.this,BHK1.class);
        startActivity(intent);
    }
}