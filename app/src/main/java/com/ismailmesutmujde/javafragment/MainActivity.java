package com.ismailmesutmujde.javafragment;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void goToFirst(View view) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        FirstFragment firstFragment = new FirstFragment();
        //fragmentTransaction.add(R.id.frame_layout, firstFragment).commit();
        fragmentTransaction.replace(R.id.frame_layout, firstFragment).commit();

    }
    public void goToSecond(View view){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        SecondFragment secondFragment = new SecondFragment();
        //fragmentTransaction.add(R.id.frame_layout, secondFragment).commit();
        fragmentTransaction.replace(R.id.frame_layout, secondFragment).commit();

    }
}