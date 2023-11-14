package com.ccarbonel.trabajofinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import com.ccarbonel.trabajofinal.DAO.DAOtipousuario;
import com.ccarbonel.trabajofinal.entidades.TipoUsuario;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private Button btncrearusuario;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        crearUsuario();


    }



    private void crearUsuario(){
        Button btncrearusuario = findViewById(R.id.btncrearusuario);
        btncrearusuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,CrearUsuarioActivity.class);
                startActivity(intent);
            }

        });
    }




}