package com.example.shiftthecity08;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class login extends AppCompatActivity {

    EditText t1,t2;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        t1=(EditText)findViewById(R.id.email_id);
        t2=(EditText)findViewById(R.id.pass_word);

        mAuth = FirebaseAuth.getInstance();

    }

    public void gotosignup(View view)
    {
        startActivity(new Intent(login.this,MainActivity.class));
    }

    public void signinhere(View view)
    {
        String email=t1.getEditableText().toString();
        String password=t2.getEditableText().toString();

        mAuth.signInWithEmailAndPassword(email, password)
                .addOnCompleteListener(login.this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            // Sign in success, update UI with the signed-in user's information

                            Intent intent=new Intent(login.this,dashboard.class);
                            startActivity(intent);

                        }
                        else

                            {
                                // If sign in fails, display a message to the user.

                                t1.setText("");
                                t2.setText("");
                                Toast.makeText(getApplicationContext(), "InValid Emali/Password", Toast.LENGTH_LONG).show();
                        }

                        // ...
                    }
                });

    }
}