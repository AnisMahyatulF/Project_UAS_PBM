package com.example.informasitni;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class tniangkatanlaut extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tniangkatanlaut);
    }

    public void pangkattnial(View view){

        Intent intent = new Intent(tniangkatanlaut.this, pangkattnial.class);
        startActivity(intent);
    }

    public void komandoutamatnial(View view){

        Intent intent = new Intent(tniangkatanlaut.this, komandoutamatnial.class);
        startActivity(intent);
    }

    public void alattempurtnial(View view){

        Intent intent = new Intent(tniangkatanlaut.this, alattempurtnial.class);
        startActivity(intent);
    }

    public void organisasitnial(View view){

        Intent intent = new Intent(tniangkatanlaut.this, organisasitnial.class);
        startActivity(intent);
    }

    public void tempattugastnial(View view){

        Intent intent = new Intent(tniangkatanlaut.this, tempattugastnial.class);
        startActivity(intent);
    }
}