package com.example.gitarcompare;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.gitarcompare.fragments.ChartFragment;
import com.example.gitarcompare.fragments.HomeFragment;
import com.example.gitarcompare.fragments.UserFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    private FirebaseAuth.AuthStateListener authListener;
    private FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadFragment(new HomeFragment());
        BottomNavigationView bottomNavigationView = findViewById(R.id.navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(this);
        getSupportFragmentManager().beginTransaction()
        .replace(R.id.fragment_container, new HomeFragment())
        .commit();
    }

    public void kumpulanLagu(View view) {
        Intent intent =  new Intent(this, KumpulanLagu.class);
        startActivity(intent);
    }

    public void tutorialChord(View view) {
        Intent intent =  new Intent(this, TutorialChord.class);
        startActivity(intent);
    }

    private boolean loadFragment(Fragment fragment){
        if(fragment != null){
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragment_container, fragment)
                    .addToBackStack(null)
                    .commit();
            return true;
        }
        return false;
    }
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        Fragment fragment = null;
        switch (menuItem.getItemId()){
            case R.id.beranda :
                fragment = new HomeFragment();
                break;
            case R.id.charts :
                fragment = new ChartFragment();
                break;
            case R.id.user :
                fragment = new UserFragment();
                break;
        }
        return loadFragment(fragment);
    }
    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
