package com.example.masjidpekanbaru;

import androidx.appcompat.app.AppCompatActivity;

import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MasjidRayaRiau extends AppCompatActivity implements View.OnClickListener {

    private Button btnwebmasjidrayariau, btnpetamasjidrayariau;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_masjid_raya_riau);

        btnwebmasjidrayariau = findViewById(R.id.btnwebmasjidrayariau);
        btnpetamasjidrayariau = findViewById(R.id.btnpetamasjidrayariau);

        btnwebmasjidrayariau.setOnClickListener(this);
        btnpetamasjidrayariau.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.btnwebmasjidrayariau:
                Intent intent = new Intent(Intent.ACTION_WEB_SEARCH);
                intent.putExtra(SearchManager.QUERY, ("Masjid Raya Riau"));
                startActivity(intent);
                break;

            case R.id.btnpetamasjidrayariau:
                String geo ="geo:0.553064, 101.400788";
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(geo));
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
                break;


        }


    }
}