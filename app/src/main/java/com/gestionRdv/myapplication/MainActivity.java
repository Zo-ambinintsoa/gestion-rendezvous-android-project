package com.gestionRdv.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    DbClass db;
    EditText patientId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        db = new DbClass(this);
    }

    public void addPatient(View view){

    }

    public void updatePatient(View view){

    }

    public void deletePatient(View view){

    }

    public void fetchPatient(View view){

    }

}