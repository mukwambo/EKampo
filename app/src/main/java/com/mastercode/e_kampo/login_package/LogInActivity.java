package com.mastercode.e_kampo.login_package;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.mastercode.e_kampo.R;
import com.mastercode.e_kampo.signup_package.SignUpActivity;
import com.mastercode.e_kampo.dashboard_package.DashboardActivity;

public class LogInActivity extends AppCompatActivity {
    TextView forgot_password;
    Button button;
    TextView create_account;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        // Allow the user to reset forgotten password
        forgot_password = findViewById(R.id.forgot_password);
        forgot_password.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(LogInActivity.this, "You forgot your password",
                        Toast.LENGTH_SHORT).show();
            }
        });

        // Authentication and dashboard access
        button = findViewById(R.id.sign_in_btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), DashboardActivity.class);
                startActivity(intent);
            }
        });

        //Access the sign up in activity from the log in activity
        create_account = findViewById(R.id.create_account);
        create_account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toSignUp = new Intent(getApplicationContext(), SignUpActivity.class);
                startActivity(toSignUp);
                finish();
            }
        });

    }
}