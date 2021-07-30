package com.example.fypapp.Teacher_kids_panel_activity.Registeration;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.fypapp.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class registerationActivity extends AppCompatActivity {
    Button main_page_button;
    TextView login_page;
    EditText name_Field, adress_Field, email_Field, pass_Field;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registeration);
        mAuth = FirebaseAuth.getInstance();
        FirebaseApp.initializeApp(this);
        main_page_button = (Button) findViewById(R.id.Main_page);
        login_page = (TextView) findViewById(R.id.login_pagee);
        name_Field = (EditText) findViewById(R.id.name);
        adress_Field = (EditText) findViewById(R.id.adress);
        email_Field = (EditText) findViewById(R.id.emai);
        pass_Field = (EditText) findViewById(R.id.pass);
        main_page_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nametext = name_Field.getText().toString().trim();
                String adresstext = adress_Field.getText().toString().trim();
                String emailtext = email_Field.getText().toString().trim();
                String passtext = pass_Field.getText().toString().trim();
                if (nametext.isEmpty() || adresstext.isEmpty() || emailtext.isEmpty() || passtext.isEmpty()) {
                    Toast.makeText(registerationActivity.this, "Enter data Please", Toast.LENGTH_SHORT).show();
                } else {

                    mAuth.createUserWithEmailAndPassword(emailtext, passtext).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (task.isSuccessful()) {
                                Toast.makeText(registerationActivity.this, "data save", Toast.LENGTH_SHORT).show();
                            } else {
                                Toast.makeText(registerationActivity.this, "errro", Toast.LENGTH_SHORT).show();
                            }

                        }
                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Toast.makeText(registerationActivity.this, e.getMessage(), Toast.LENGTH_SHORT).show();

                        }
                    });


                }


            }
        });
        login_page.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent loginPAge = new Intent(getApplicationContext(), loginActivity.class);
                startActivity(loginPAge);


            }
        });
    }

}
