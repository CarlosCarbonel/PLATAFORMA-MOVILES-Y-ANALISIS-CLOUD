package com.ccarbonel.trabajofinal.DAO;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.ccarbonel.trabajofinal.entidades.Usuarios;
import com.ccarbonel.trabajofinal.util.BaseDatos;

public class DAOusuarios {
    BaseDatos base;
    SQLiteDatabase db;
    Context context;

    public DAOusuarios(Context context){
        this.context= context;
        base= new BaseDatos(context);
    }
    public void abrirBD() { db = base.getWritableDatabase(); }

    public String registrarusuarios(Usuarios usuarios){
        try{
            ContentValues valores= new ContentValues();
            valores.put("us_nombres", usuarios.getNombres());;
            valores.put("us_apellidos", usuarios.getApellidos());
            valores.put("us_dni", usuarios.getDni());
            valores.put("us_distrito", usuarios.getDistrito());
            valores.put("us_direccion", usuarios.getDireccion());
        }catch (Exception e){
            Log.d("==>", e.getMessage());
        }

        return null;
    }
}
