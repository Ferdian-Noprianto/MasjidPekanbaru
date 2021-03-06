package com.example.masjidpekanbaru;

import androidx.appcompat.app.AppCompatActivity;

import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MasjidAgungAnnur extends AppCompatActivity implements View.OnClickListener {

    private Button btnwebmasjidagungannur, btnpetamasjidagungannur;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_masjid_agung_annur);

        btnwebmasjidagungannur = findViewById(R.id.btnwebmasjidagungannur);
        btnpetamasjidagungannur = findViewById(R.id.btnpetamasjidagungannur);

        btnwebmasjidagungannur.setOnClickListener(this);
        btnpetamasjidagungannur.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.btnwebmasjidagungannur:
                Intent intent = new Intent(Intent.ACTION_WEB_SEARCH);
                intent.putExtra(SearchManager.QUERY, ("Masjid Agung Ar Rahman"));
                startActivity(intent);
                break;

            case R.id.btnpetamasjidagungannur:
                String geo ="geo:0.526660, 101.450854";
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(geo));
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
                break;


        }


    }
}