package com.example.gitarcompare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void kumpulanLagu(View view) {
        Intent intent =  new Intent(this, KumpulanLagu.class);
        startActivity(intent);
    }

    public void tutorialChord(View view) {
        Intent intent =  new Intent(this, TutorialChord.class);
        startActivity(intent);
    }
}
