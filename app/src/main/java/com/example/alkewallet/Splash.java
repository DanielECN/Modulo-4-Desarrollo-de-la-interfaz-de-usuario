package com.example.alkewallet;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.content.Context;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Splash extends AppCompatActivity {


    public static class MyToast {
        public static void showLongToast(Context context, String message) {
            Toast.makeText(context, message, Toast.LENGTH_LONG).show();
        }

    }

    ImageView btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);

        btn1 = findViewById(R.id.logo_ir_loginsignup);

        btn1.setOnClickListener(v -> {
            Intent intent = new Intent(Splash.this,Login_Signup_Page.class);
            startActivity(intent);
        });

        MyToast.showLongToast(this, "BIENVENIDO, CLICK EN EL LOGO PARA INICIAR");
    }

}

