package com.ccarbonel.trabajofinal.util;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class BaseDatos extends SQLiteOpenHelper {

    public BaseDatos(Context contex){super(contex, "Microdelivery.db",null,3 );}

    @Override
    public void onCreate(SQLiteDatabase db) {
        String query ="CREATE TABLE tipousuario ("+
                "tipous_id INTEGER PRIMARY KEY AUTOINCREMENT,"+
                "tipous_tipo NOT NULL);";
        db.execSQL(query);
        query ="INSERT INTO tipousuario VALUES (NULL, 'VENDEDOR');";
        db.execSQL(query);
        query ="INSERT INTO tipousuario VALUES (NULL, 'REPARTIDOR');";
        db.execSQL(query);
        query ="INSERT INTO tipousuario VALUES (NULL, 'RECEPTOR');";
        db.execSQL(query);

        query  = "CREATE TABLE usuarios ("+
                "us_id INTEGER PRIMARY KEY AUTOINCREMENT,"+
                "us_nombres NOT NULL,"+
                "us_apellidos NOT NULL,"+
                "us_dni NOT NULL,"+
                "us_distrito NOT NULL,"+
                "us_direccion NOT NULL,"+
                "tipous_id INTEGER NOT NULL,"+
                "foreign key(tipous_id)references tipousuario(tipous_id));";
        db.execSQL(query);

        query="CREATE TABLE rubrotienda("+
                "rubrotd_id INTEGER PRIMARY KEY AUTOINCREMENT,"+
                "rubrotd_tipo NOT NULL);";
        db.execSQL(query);
        query="INSERT INTO rubrotienda VALUES (NULL, 'JUGUETERIA');";
        db.execSQL(query);
        query="INSERT INTO rubrotienda VALUES (NULL,'FERRETERIA');";
        db.execSQL(query);
        query="INSERT INTO rubrotienda VALUES(NULL,'ROPA');";
        db.execSQL(query);
        query="INSERT INTO rubrotienda VALUES(NULL,'BISUTERIA');";
        db.execSQL(query);
        query="INSERT INTO rubrotienda VALUES(NULL,'ABARROTES');";
        db.execSQL(query);
        query="INSERT INTO rubrotienda VALUES(NULL,'VIDEO JUEGOS');";
        db.execSQL(query);
        query="INSERT INTO rubrotienda VALUES(NULL,'OTROS');";
        db.execSQL(query);

        query ="CREATE TABLE tiendas ("+
                "td_id INTEGER PRIMARY KEY AUTOINCREMENT,"+
                "td_nombre NOT NULL,"+
                "td_celular NOT NULL,"+
                "td_direccion NOT NULL,"+
                "td_distrito NOT NULL," +
                "rubrotd_id INTEGER NOT NULL,"+
                "foreign key(rubrotd_id) references rubrotienda(rubrotd_id));";
        db.execSQL(query);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
