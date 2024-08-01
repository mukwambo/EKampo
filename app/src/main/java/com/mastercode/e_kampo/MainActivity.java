package com.mastercode.e_kampo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.mastercode.e_kampo.login_package.LogInActivity;
import com.mastercode.e_kampo.signup_package.SignUpActivity;

public class MainActivity extends AppCompatActivity {
    Button get_started;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        get_started = findViewById(R.id.get_started_btn);
        get_started.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toSignIn = new Intent(getApplicationContext(), LogInActivity.class);
                startActivity(toSignIn);
            }
        });

    }
}