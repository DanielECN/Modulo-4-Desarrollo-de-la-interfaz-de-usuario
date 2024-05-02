package com.example.alkewallet;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Login_Signup_Page extends AppCompatActivity {
    Button btn2;
    Button btn3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_signup_page);

        btn2 = findViewById(R.id.btn_create_account_loginsignuppage);

        btn2.setOnClickListener(v -> {
            Intent intent = new Intent(Login_Signup_Page.this,Signup_Page.class);
            startActivity(intent);
        });

        btn3 = findViewById(R.id.btn_login_loginsignuppage);

        btn3.setOnClickListener(v -> {
            Intent intent = new Intent(Login_Signup_Page.this,Login_Page.class);
            startActivity(intent);
        });
    }
}