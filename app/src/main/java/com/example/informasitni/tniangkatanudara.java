package com.example.informasitni;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class tniangkatanudara extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tniangkatanudara);
    }

    public void pangkattniau(View view){

        Intent intent = new Intent(tniangkatanudara.this, pangkattniau.class);
        startActivity(intent);
    }

    public void komandoutamatniau(View view){

        Intent intent = new Intent(tniangkatanudara.this, komandoutamatniau.class);
        startActivity(intent);
    }

    public void alattempurtniau(View view){

        Intent intent = new Intent(tniangkatanudara.this, alattempurtniau.class);
        startActivity(intent);
    }

    public void organisasitniau(View view){

        Intent intent = new Intent(tniangkatanudara.this, organisasitniau.class);
        startActivity(intent);
    }

    public void tempattugastniau(View view){

        Intent intent = new Intent(tniangkatanudara.this, tempattugastniau.class);
        startActivity(intent);
    }
}