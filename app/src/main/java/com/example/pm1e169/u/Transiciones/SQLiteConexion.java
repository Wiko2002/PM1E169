package com.example.pm1e169.u.Transiciones;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.pm1e169.Transiciones;

public class SQLiteConexion extends SQLiteOpenHelper {

    public SQLiteConexion(Context context, String dbname, SQLiteDatabase.CursorFactory factory, int version){

        super(context, dbname, factory, version);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(Transiciones.CreateTablePersonas);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL(Transiciones.DropTablePersonas);
        onCreate(db);
    }


}
