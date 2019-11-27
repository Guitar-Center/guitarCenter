package com.example.gitarcompare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class KumpulanLagu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kumpulan_lagu);
    }

    public void lagu1(View view) {
        Intent intent =  new Intent(this, lagu1.class);
        startActivity(intent);
    }

    public void lagu2(View view) {
        Intent intent =  new Intent(this, lagu2.class);
        startActivity(intent);
    }

    public void lagu3(View view) {
        Intent intent =  new Intent(this, lagu3.class);
        startActivity(intent);
    }

    public void lagu4(View view) {
        Intent intent =  new Intent(this, lagu4.class);
        startActivity(intent);
    }

    public void lagu5(View view) {
        Intent intent =  new Intent(this, lagu5.class);
        startActivity(intent);
    }
}
