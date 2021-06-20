package com.example.masjidpekanbaru;

import androidx.appcompat.app.AppCompatActivity;

import android.app.SearchManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MasjidRayaPekanbaru extends AppCompatActivity implements View.OnClickListener {

    private Button btnwebmasjidrayapku, btnpetamasjidrayapku;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_masjid_raya_pekanbaru);

        btnwebmasjidrayapku = findViewById(R.id.btnwebmasjidrayapku);
        btnpetamasjidrayapku = findViewById(R.id.btnpetamasjidrayapku);

        btnwebmasjidrayapku.setOnClickListener(this);
        btnpetamasjidrayapku.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.btnwebmasjidrayapku:
                Intent intent = new Intent(Intent.ACTION_WEB_SEARCH);
                intent.putExtra(SearchManager.QUERY, ("Masjid Raya Pekanbaru"));
                startActivity(intent);
                break;

            case R.id.btnpetamasjidrayapku:
                String geo ="geo:0.537420,101.441991";
                Intent mapIntent = new Intent(Intent.ACTION_VIEW,Uri.parse(geo));
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
                break;


        }


    }
}