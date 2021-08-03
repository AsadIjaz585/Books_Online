package com.example.books_online;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText et_id_email,et_id_password;
    Button btn_login,btn_clear;
    TextView next_activity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        id();

        next_activity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Signup.class);
                startActivity(i);
                finish();
            }
        });

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String id = et_id_email.getText().toString();
                String pass = et_id_password.getText().toString();
//                ID_display_text.setText(id +" \n "+ pass);
            }
        });

        btn_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clear();
            }
        });
    }

    public  void id(){
        et_id_email = findViewById(R.id.et_id_email);
        et_id_password = findViewById(R.id.et_id_password);
        btn_login = findViewById(R.id.btn_login);
        btn_clear = findViewById(R.id.btn_clear);
        next_activity = findViewById(R.id.next_activity);    }
    public void clear()
    {
        et_id_email.setText("");
        et_id_password.setText("");
    }
}