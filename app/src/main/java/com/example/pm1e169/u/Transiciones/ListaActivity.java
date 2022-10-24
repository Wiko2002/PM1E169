package com.example.pm1e169.u.Transiciones;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.pm1e169.R;
import com.example.pm1e169.u.Tablas.Personas;
import com.example.pm1e169.Transiciones;

import java.util.ArrayList;

public class ListaActivity extends AppCompatActivity {

    SQLiteConexion conexion;
    ListView listapersonas;
    ArrayList<Personas> lista;
    ArrayList<String> ArregloPersonas;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);


        conexion = new SQLiteConexion(this, Transiciones.NameDataBase, null, 1);
        listapersonas = (ListView) findViewById(R.id.listaPersonas);

        ObtenerListaPersonas();

        ArrayAdapter adp = new ArrayAdapter(this, android.R.layout.simple_list_item_1, ArregloPersonas);
        listapersonas.setAdapter(adp);

    }

    private void ObtenerListaPersonas() {
        SQLiteDatabase db = conexion.getReadableDatabase();
        Personas list_personas = null;
        lista = new ArrayList<Personas>();

        //cursor de la base de datos : nos apoya en recorrer  la info de la tabla a la cual consultamos

        Cursor cursor = db.rawQuery("SELECT * FROM " + Transiciones.tablapersonas, null);

        //recorremos la info del cursor
        while (cursor.moveToNext()){

            list_personas = new Personas();
            list_personas.setId(cursor.getInt(0));
            list_personas.setPais(cursor.getString(1));
            list_personas.setNombre(cursor.getString(2));
            list_personas.setNumero(cursor.getInt(3));
            list_personas.setNota(cursor.getString(4));

            lista.add(list_personas);

        }

        db.close();

        filllist();

    }

    private void filllist() {
        ArregloPersonas = new ArrayList<String>();

        for (int i = 0; i < lista.size(); i++) {
            ArregloPersonas.add(lista.get(i).getId() + "|"
                    + lista.get(i).getNombre() + "|"
                    + lista.get(i).getPais() + "|"
                    + lista.get(i).getNumero() + "|"
                    + lista.get(i).getNota());
        }


    }
}