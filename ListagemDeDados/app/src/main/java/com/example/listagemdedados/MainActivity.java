package com.example.listagemdedados;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    TextInputEditText email, senha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        email=findViewById(R.id.editTextEmail);
        senha=findViewById(R.id.editTextSenha);
    }
    public void login(View view){
        if((email.getText().toString().equals("brunno.victo@hotmail.com")&&senha.getText().toString().equals("amoajioanny"))||(email.equals("carinesoares.csa@gmail.com")&&senha.equals("amoolucas"))){
            Intent proxTela = new Intent(MainActivity.this, ListaDeAssuntos.class);
            startActivity(proxTela);
        }else{
            Toast.makeText(getApplicationContext(),"Cadastro inválido!\nVerifique seus dados e tente novamente",Toast.LENGTH_LONG).show();
        }
    }
}
