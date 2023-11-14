package com.ccarbonel.trabajofinal.DAO;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.ccarbonel.trabajofinal.entidades.TipoUsuario;
import com.ccarbonel.trabajofinal.util.BaseDatos;

import java.util.ArrayList;
import java.util.List;

public class DAOtipousuario {
    BaseDatos base;
    SQLiteDatabase db;
    Context context;

    public DAOtipousuario(Context context){
        base= new BaseDatos(context);
        this.context=context;
    }
    public void abrirBD() { db = base.getWritableDatabase(); }

        public List<TipoUsuario> obtenerTipoUsuario(){
            List<TipoUsuario>ListaTipoUsuario = new ArrayList<>();
            try{
                Cursor c= db.rawQuery("SELECT * FROM tipousuario",null);
                while (c.moveToNext()){
                    ListaTipoUsuario.add(new TipoUsuario(c.getInt(0),c.getString(1)));
                }
            } catch (Exception e){
                Log.d("==>",e.getMessage());
            }
                return ListaTipoUsuario;
        }

}
