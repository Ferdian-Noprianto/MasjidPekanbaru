package com.example.masjidpekanbaru;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnmasjidrayapku, btnmasjidrayariau, btnmasjidagungarrahman, btnmasjidagungannur;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnmasjidrayapku = findViewById(R.id.btnmasjidrayapku);
        btnmasjidrayapku.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MasjidRayaPekanbaru.class);
                startActivity(intent);
                finish();
            }
        });

        btnmasjidrayariau = findViewById(R.id.btnmasjidrayariau);
        btnmasjidrayariau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MasjidRayaRiau.class);
                startActivity(intent);
                finish();
            }
        });

        btnmasjidagungannur = findViewById(R.id.btnmasjidagungannur);
        btnmasjidagungannur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MasjidAgungAnnur.class);
                startActivity(intent);
                finish();
            }
        });

        btnmasjidagungarrahman = findViewById(R.id.btnmasjidagungarrahman);
        btnmasjidagungarrahman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MasjidAgungArrahman.class);
                startActivity(intent);
                finish();
            }
        });
    }
}