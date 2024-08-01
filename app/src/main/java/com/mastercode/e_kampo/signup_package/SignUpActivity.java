package com.mastercode.e_kampo.signup_package;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.mastercode.e_kampo.R;
import com.mastercode.e_kampo.login_package.LogInActivity;

public class SignUpActivity extends AppCompatActivity {
    TextView have_account;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        have_account = findViewById(R.id.have_account);
        have_account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toLogIn = new Intent(getApplicationContext(), LogInActivity.class);
                startActivity(toLogIn);
                finish();
            }
        });
    }
}