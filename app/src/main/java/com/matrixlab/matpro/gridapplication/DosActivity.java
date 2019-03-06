package com.matrixlab.matpro.gridapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.EditText;

public class DosActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dos);

        Intent i = getIntent();
        final String nama = i.getStringExtra("nama");
        Log.e("dosScreen", nama);

        EditText nma = findViewById(R.id.nma);
        nma.setText(nama);
    }
}
