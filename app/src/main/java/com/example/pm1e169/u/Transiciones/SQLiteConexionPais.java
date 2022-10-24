package com.example.pm1e169.u.Transiciones;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class SQLiteConexionPais extends SQLiteOpenHelper {
    public SQLiteConexionPais(Context context, String dbname, SQLiteDatabase.CursorFactory factory, int version){

        super(context, dbname, factory, version);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(TransicionesPais.CreateTablePais);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL(TransicionesPais.DropTablePais);
        onCreate(db);
    }
}

