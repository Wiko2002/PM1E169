package com.example.pm1e169;

public class Transiciones {

    public static final String tablapersonas = "personas";

    public static final String id = "id";
    public static final String pais = "pais";
    public static final String nombre = "nombre";
    public static final String numero = "numero";
    public static final String nota = "nota";

    public static final String CreateTablePersonas = "CREATE TABLE " + tablapersonas+"(" + id + " INTEGER PRIMARY KEY AUTOINCREMENT, "+pais+" TEXT, "+nombre+" TEXT, "+numero+" INTEGER, "+nota+" TEXT)";
    // public static final String CreateTablePersonas1 =  "CREATE TABLE " +tablapersonas+ " ("+NOMBRE+ " TEXT, "+EDAD+" INTEGER, "+CIUDAD+" TEXT, "+CODIGOPOSTAL+" INTEGER, "+SEXO+" TEXT, "+PAIS+" TEXT)";
    public static final String DropTablePersonas = "DROP TABLE IF EXISTS personas";




    /* Creacion del nombre de la base de datos */
    public static final String NameDataBase = "DBExamen";


}
