package com.gestionRdv.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static java.lang.Integer.parseInt;

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
                addPatient();
            }
        });
    }

    public void addPatient(){

            String NomP = this.NomP.getText().toString();
            String address = this.address.getText().toString();
            int nbJour = parseInt(this.nbJour.getText().toString());
            int montant = parseInt(this.montant.getText().toString());

            Patient p = new Patient(NomP, nbJour, address, montant);

            boolean inserted = db.addPHandler(p);
            if (inserted){
                Toast.makeText(MainActivity.this, "Patient Ajouter", Toast.LENGTH_LONG).show();
            } else {
                Toast.makeText(MainActivity.this, "un erreur est survenue", Toast.LENGTH_LONG).show();
            }
    }

    public void updatePatient(View view){

    }

    public void deletePatient(View view){

    }

    public void fetchPatient(View view){

    }

}