package com.example.masjidpekanbaru;

import androidx.appcompat.app.AppCompatActivity;

import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MasjidAgungArrahman extends AppCompatActivity implements View.OnClickListener{

    private Button btnwebmasjidagungarrahman, btnpetamasjidagungarrahman;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_masjid_agung_arrahman);

        btnwebmasjidagungarrahman = findViewById(R.id.btnwebmasjidagungarrahman);
        btnpetamasjidagungarrahman = findViewById(R.id.btnpetamasjidagungarrahman);

        btnwebmasjidagungarrahman.setOnClickListener(this);
        btnpetamasjidagungarrahman.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.btnwebmasjidagungarrahman:
                Intent intent = new Intent(Intent.ACTION_WEB_SEARCH);
                intent.putExtra(SearchManager.QUERY, ("Masjid Agung Ar Rahman"));
                startActivity(intent);
                break;

            case R.id.btnpetamasjidagungarrahman:
                String geo ="geo:0.511077, 101.448776";
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(geo));
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
                break;


        }


    }
}