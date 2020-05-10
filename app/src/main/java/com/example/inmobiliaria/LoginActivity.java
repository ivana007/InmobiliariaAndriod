package com.example.inmobiliaria;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends Activity {
    private EditText etEmail,etPass;
    private TextView tvCartelError;
    private Button btnIngresar;
    private LoginViewModel lvm;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        iniciarVista();
        //lvm= ViewModelProviders.of(this).get(LoginViewModel.class);


    }
    public  void iniciarVista(){
        etEmail=findViewById(R.id.etEmail);
        etPass=findViewById(R.id.etPass);
        etEmail.setText("");
        etPass.setText("");

    }
    public void validar(View v){
        boolean res=lvm.validardatos(etEmail.getText(), etPass.getText());

    if(res){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }



    }
}
