package com.matrixlab.matpro.gridapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent i = getIntent();
        final String nama = i.getStringExtra("nama");
        Log.e("halaman utama", nama);

        findViewById(R.id.insta).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "http://www.instagram.com/_avos_";

                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
        findViewById(R.id.tuwiter).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "http://www.twitter.com/_dwit_";

                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
        findViewById(R.id.fesbuk).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "http://www.facebook.com/";

                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
        findViewById(R.id.watsap).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "whatsapp://send?phone=085815723989";

                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
        findViewById(R.id.git).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://github.com/dwiga";

                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
        findViewById(R.id.setak).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://stackoverflow.com/";

                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
        findViewById(R.id.gua).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dosScreen = new Intent(getApplicationContext(), DosActivity.class);
                dosScreen.putExtra("nama", nama);
                Log.e("Dos", nama);
                startActivity(dosScreen);
            }
        });
    }
}
