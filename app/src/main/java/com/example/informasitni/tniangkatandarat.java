package com.example.informasitni;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class tniangkatandarat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tniangkatandarat);
    }

    public void TNIAngkatanDarat(View view){

        Intent intent = new Intent(tniangkatandarat.this, pangkattniad.class);
        startActivity(intent);
    }

    public void komandoutamatniad(View view){

        Intent intent = new Intent( tniangkatandarat.this, komandoutamatniad.class);
        startActivity(intent);
    }

    public void AlatTempurTniad(View view){

        Intent intent = new Intent( tniangkatandarat.this, alattempurtniad.class);
        startActivity(intent);
    }

    public void OrganisasiTniad(View view){

        Intent intent = new Intent( tniangkatandarat.this, organisasitniad.class);
        startActivity(intent);
    }

    public void tempattugastniad(View view){

        Intent intent = new Intent( tniangkatandarat.this, tempattugastniad.class);
        startActivity(intent);
    }

}