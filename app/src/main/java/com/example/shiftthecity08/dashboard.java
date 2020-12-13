package com.example.shiftthecity08;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
    }

    public void services(View view)
    {
        Intent intent=new Intent(dashboard.this,services.class);
        startActivity(intent);
    }

    public void settings(View view)
    {
        Intent intent=new Intent(dashboard.this,settings.class);
        startActivity(intent);
    }

    public void contactus(View view)
    {
        Intent intent=new Intent(dashboard.this,contactus.class);
        startActivity(intent);
    }

    public void aboutus(View view)
    {

        Intent intent=new Intent(dashboard.this,aboutus.class);
        startActivity(intent);
    }

    public void logout(View view)
    {
        startActivity(new Intent(dashboard.this,login.class));
    }

    public void payment(View view)
    {
        Intent intent=new Intent(dashboard.this,payment.class);
        startActivity(intent);
    }
}