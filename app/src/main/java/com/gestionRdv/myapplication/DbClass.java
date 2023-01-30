package com.gestionRdv.myapplication;

import android.content.Context;
import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DbClass extends SQLiteOpenHelper {


//    database name
    public static final String DB_NAME = "Doctor_database";
    public static final String primaryKey_Column = "id";

//    data for the doctor table

    public static final String Doctor_Table = "Doctor_table";
    public static final String Doctor_Column1 = "Nom";
    public static final String Doctor_Column2 = "Prestation";

//    data for the table patient

    public static final String Patient_Table = "Patient_table";
    public static final String Patient_Column1 = "nom";
    public static final String Patient_Column2 = "NbJour";
    public static final String Patient_Column3 = "address";
    public static final String Patient_Column4 = "montant";
    public static final String Patient_Column5 = "idMed";


    public DbClass(@Nullable Context context) {
        super(context, DB_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        try {
    db.execSQL(" CREATE TABLE " + Doctor_Table + " ("+ primaryKey_Column +" INTEGER PRIMARY KEY AUTOINCREMENT, "+ Doctor_Column1 +" TEXT NOT NULL, "+ Doctor_Column2 +" INTEGER ) ");
    db.execSQL(" CREATE TABLE " + Patient_Table + " ("+ primaryKey_Column +" INTEGER PRIMARY KEY AUTOINCREMENT, " + Patient_Column5 +" INTEGER NOT NULL, "+ Patient_Column1 +" TEXT NOT NULL, "+ Patient_Column2 +" INTEGER, "+ Patient_Column3 +" TEXT, "+Patient_Column4+" INTEGER ) ");
        } catch (Exception e) {

        }
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        try {

    db.execSQL("DROP TABLE IF EXISTS " + Doctor_Table);
    db.execSQL("DROP TABLE IF EXISTS " + Patient_Table);
        } catch (Exception e) {

        }
    onCreate(db);
    }

    public boolean addPHandler(Patient patient){
        long id;
        ContentValues values = new ContentValues();
        values.put(primaryKey_Column, patient.getId());
        values.put(Patient_Column1, patient.getNomP());
        values.put(Patient_Column2, patient.getNbJour());
        values.put(Patient_Column3, patient.getAddress());
        values.put(Patient_Column4, patient.getMontant());
        values.put(Patient_Column5, 1);
        SQLiteDatabase db = this.getWritableDatabase();
        id = db.insert(Patient_Table, null, values);
        if (id == -1){
            db.close();
            return false;
        } else {
            db.close();
            return true;
        }
    }
    boolean updatePHandler(int id, String NomP, String address, int montant, int nbJour) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues args = new ContentValues();
        args.put(primaryKey_Column, id);
        args.put(Patient_Column1, NomP);
        args.put(Patient_Column3, address);
        args.put(Patient_Column4, montant);
        args.put(Patient_Column2, nbJour);
        return db.update(Patient_Table, args, primaryKey_Column + "=" + id, null) > 0;
    }
}
