package com.gestionRdv.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    DbClass db;
    EditText patientId, NomP, address, nbJour, montant;
    Button btnSave1, btncancel1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        db = new DbClass(this);

        NomP = findViewById(R.id.NomP);
        address = findViewById(R.id.address);
        nbJour = findViewById(R.id.nbJour);
        montant = findViewById(R.id.montant);
        btnSave1 = findViewById(R.id.btnSave1);
        btncancel1 = findViewById(R.id.btncancel1);

        btnSave1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    public void addPatient(View view){

        try {
            String NomP = this.NomP.getText().toString();
            String address = this.address.getText().toString();
            String nbJour = this.nbJour.getText().toString();
            String montant = this.montant.getText().toString();
        } catch (Exception e) {

        }
    }

    public void updatePatient(View view){

    }

    public void deletePatient(View view){

    }

    public void fetchPatient(View view){

    }

}