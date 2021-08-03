package com.example.books_online;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Signup extends AppCompatActivity {

    EditText et_id_name1,et_id_name2,et_id_email1,et_id_phonenum1,et_id_password1;
    Button btn_signup,btn_clear1;
    TextView id_moveTomain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        ids2();

        id_moveTomain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Signup.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        });

        btn_signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String add_name1 = et_id_name1.getText().toString();
                String add_name2 = et_id_name2.getText().toString();
                String add_email = et_id_email1.getText().toString();
                String add_phone = et_id_phonenum1.getText().toString();
                String add_password = et_id_password1.getText().toString();
//                ID_display_text2.setText(id_add+id_set_pass+id_cms_reg+id_degree_prog+id_sem+id_address);
            }

        });
        btn_clear1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clear();
            }
        });

    }

    public void ids2(){
        et_id_name1 = findViewById(R.id.et_id_name1);
        et_id_name2 = findViewById(R.id.et_id_name2);
        et_id_email1 = findViewById(R.id.et_id_email1);
        et_id_phonenum1 = findViewById(R.id.et_id_phonenum1);
        et_id_password1 = findViewById(R.id.et_id_password1);

        btn_signup = findViewById(R.id.btn_signup);
        btn_clear1 = findViewById(R.id.btn_clear1);

        id_moveTomain = findViewById(R.id.id_moveTomain);
    }

    public void clear()
    {
        et_id_name1.setText("");
        et_id_name2.setText("");
        et_id_email1.setText("");
        et_id_phonenum1.setText("");
        et_id_password1.setText("");
    }
}