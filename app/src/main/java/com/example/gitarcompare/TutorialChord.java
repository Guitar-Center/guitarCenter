package com.example.gitarcompare;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

import com.example.gitarcompare.fragments.ChordFragment;
import com.example.gitarcompare.fragments.VideoFragment;

public class TutorialChord extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorial_chord);
    }

    public void chordFragment(View view) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        ChordFragment chordfragment = (ChordFragment) getSupportFragmentManager().findFragmentByTag("CHORD_FRAGMENT");
        if(chordfragment != null && chordfragment.isVisible()){
            fragmentTransaction.commit();
        }else {
            fragmentTransaction.setCustomAnimations(R.anim.exit_from_right, R.anim.exit_from_left);
            fragmentTransaction.replace(R.id.tutorial_fragment,new ChordFragment(),"CHORD_FRAGMENT");
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }

    public void videoFragment(View view) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        VideoFragment videoFragment = (VideoFragment) getSupportFragmentManager().findFragmentByTag("VIDEO_FRAGMENT");
        if(videoFragment != null && videoFragment.isVisible()){
            fragmentTransaction.commit();
        }else {
            fragmentTransaction.setCustomAnimations(R.anim.exit_from_right, R.anim.exit_from_left);
            fragmentTransaction.replace(R.id.tutorial_fragment,new VideoFragment(),"VIDEO_FRAGMENT");
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }
}
