package com.example.alkewallet;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.widget.Button;

public class Signup_Page extends AppCompatActivity {

    Button btn4;

    Button btnVolver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup_page);
        btnVolver = findViewById(R.id.back_btn1);

        btn4 = findViewById(R.id.btn_create_account_loginpage);

        btn4.setOnClickListener(v -> {
            Intent intent = new Intent(Signup_Page.this,Login_Page.class);
            startActivity(intent);
        });

        btnVolver.setOnClickListener(v -> {
            finish();
        });

    }
}