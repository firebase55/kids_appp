package com.example.fypapp.Teacher_kids_panel_activity.Registeration;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.fypapp.Quiz.QuizMainActivity;
import com.example.fypapp.R;
import com.example.fypapp.teacherpanel.teacherActivity;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class loginActivity extends AppCompatActivity {
Button login_buttons;
EditText email , pass ;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        mAuth = FirebaseAuth.getInstance();
        FirebaseApp.initializeApp(this);
        login_buttons = (Button) findViewById(R.id.panel_page);
        email = (EditText)findViewById(R.id.email_id);
        pass = (EditText)findViewById(R.id.pass_id);
        login_buttons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                String emailID = email.getText().toString().trim();
                String passID = pass.getText().toString().trim();
                if(emailID.isEmpty() || passID.isEmpty())
                {
                    Toast.makeText(loginActivity.this, "Enter please", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    mAuth.signInWithEmailAndPassword(emailID,passID).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if(task.isSuccessful())
                            {
                                Intent gameIntent = new Intent(getApplicationContext(), teacherActivity.class);
                                startActivity(gameIntent);

                            }
                            else
                            {
                                Toast.makeText(loginActivity.this, "error", Toast.LENGTH_SHORT).show();
                            }
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Toast.makeText(loginActivity.this, e.getMessage(), Toast.LENGTH_SHORT).show();

                        }
                    });
                }

            }
        });

    }
}
