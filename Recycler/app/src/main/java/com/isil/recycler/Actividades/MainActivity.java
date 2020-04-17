package com.isil.recycler.Actividades;

import android.content.Intent;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.isil.recycler.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextInputLayout til_user, til_pwd;
    TextView tvLoginError;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        til_user = findViewById(R.id.til_user);
        til_pwd = findViewById(R.id.til_pwd);
        tvLoginError = findViewById(R.id.tvLoginError);
        btnLogin = findViewById(R.id.btn_login);

        tvLoginError.setVisibility(View.GONE);
        btnLogin.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        String user = til_user.getEditText().getText().toString();
        if (user.contains("@") && user.contains(".")) {
            til_user.setError("");
        if (validate()) {
            tvLoginError.setVisibility(View.GONE);
            loginSuccessful();
        } else {
            til_pwd.getEditText().setText("");
            tvLoginError.setVisibility(View.VISIBLE);
        }
    }
    else{
            til_user.setError("Nombre de usuario debe ser correo");
        }
    }

    public boolean validate(){
        String user = til_user.getEditText().getText().toString();
        String pwd = til_pwd.getEditText().getText().toString();

        return (user.equals("admin@app.com")&& pwd.equals("qwe"));
    }

    public  void loginSuccessful(){
        Toast.makeText(this, "Login Correcto", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, AlumnoActivity.class);
        startActivity(intent);
    }

}

