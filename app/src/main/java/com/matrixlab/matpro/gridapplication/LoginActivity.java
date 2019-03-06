package com.matrixlab.matpro.gridapplication;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    Button btn1, btn2;
    EditText edt1, edt2;
    TextView txt1;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btn1 = (Button) findViewById(R.id.btnLog);
        btn2 = (Button) findViewById(R.id.btnCnc);

        edt1 = (EditText) findViewById(R.id.usrnm);
        edt2 = (EditText) findViewById(R.id.pword);
        txt1 = (TextView) findViewById(R.id.txt);

        txt1.setVisibility(View.GONE);
        final int counter;

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edt1.getText().toString().equals("dwi") && edt2.getText().toString().equals("dwi269")){
                    Toast.makeText(getApplicationContext(), "Login Sukses", Toast.LENGTH_SHORT).show();
                    Intent mainScreen = new Intent(getApplicationContext(), MainActivity.class);
                    mainScreen.putExtra("nama", edt1.getText().toString());
                    Log.e("n", edt1.getText().toString());
                    startActivity(mainScreen);
                }else{
                    Toast.makeText(getApplicationContext(), "Username atau password salah", Toast.LENGTH_SHORT).show();
                    txt1.setVisibility(View.VISIBLE);
                    txt1.setBackgroundColor(Color.RED);

                    int counter = 3;
                    counter--;
                    txt1.setText(Integer.toString(counter--));

                    if(counter-- == 0){
                        btn1.setEnabled(false);
                    }
                    counter--;
                }
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
