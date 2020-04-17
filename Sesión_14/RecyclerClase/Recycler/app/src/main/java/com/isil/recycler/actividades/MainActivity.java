package com.isil.recycler.actividades;

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

    TextInputLayout tilUser, tilPwd;
    TextView tvLoginError;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tilUser = findViewById(R.id.til_user);
        tilPwd = findViewById(R.id.til_pwd);
        tvLoginError = findViewById(R.id.tvLoginError);
        btnLogin = findViewById(R.id.btn_login);

        tvLoginError.setVisibility(View.GONE);
        btnLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String user = tilUser.getEditText().getText().toString();
        if(user.contains("@") && user.contains(".")){
            tilUser.setError("");
            if(validate()){
                tvLoginError.setVisibility(View.GONE);
                loginSuccessful();
            }
            else{
                tilPwd.getEditText().setText("");
                tvLoginError.setVisibility(View.VISIBLE);
            }
        }
        else{
            tilUser.setError("nombre de usuario debe ser un correo electronico");
        }


    }

    public boolean validate(){
        String user = tilUser.getEditText().getText().toString();
        String pwd = tilPwd.getEditText().getText().toString();

        return (user.equals("admin@app.com") && pwd.equals("qwe"));
    }

    public void loginSuccessful(){
        Toast.makeText(this, "Login Correcto", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, AlumnosActivity.class);
        startActivity(intent);
    }
}
