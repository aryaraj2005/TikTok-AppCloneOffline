package com.example.tiktok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import com.example.tiktok.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
     ActivityMainBinding binding;
     ArrayList<Model> arrayList = new ArrayList<>();
     Adapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN , WindowManager.LayoutParams.FLAG_FULLSCREEN);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().hide();
        this.getTheme().applyStyle(R.style.FullScreen,false);
        arrayList.add(new Model( "android.resource://" + getPackageName() + "/" + R.raw.katrina, R.drawable.woman , "Arya raj"));
        arrayList.add(new Model( "android.resource://" + getPackageName() + "/" + R.raw.tumkobarish, R.drawable.woman , "Arya raj"));
        arrayList.add(new Model( "android.resource://" + getPackageName() + "/" + R.raw.chand, R.drawable.woman , "Arya raj"));
        arrayList.add(new Model( "android.resource://" + getPackageName() + "/" + R.raw.chandwalla, R.drawable.woman , "Arya raj"));
        arrayList.add(new Model( "android.resource://" + getPackageName() + "/" + R.raw.humnshe, R.drawable.woman , "Arya raj"));
        arrayList.add(new Model( "android.resource://" + getPackageName() + "/" + R.raw.ascetic, R.drawable.woman , "Arya raj"));
        arrayList.add(new Model( "android.resource://" + getPackageName() + "/" + R.raw.kesariya, R.drawable.woman , "Arya raj"));
        arrayList.add(new Model( "android.resource://" + getPackageName() + "/" + R.raw.kk, R.drawable.woman , "Arya raj"));
        arrayList.add(new Model( "android.resource://" + getPackageName() + "/" + R.raw.latest, R.drawable.woman , "Arya raj"));
        arrayList.add(new Model( "android.resource://" + getPackageName() + "/" + R.raw.love, R.drawable.woman , "Arya raj"));
        arrayList.add(new Model( "android.resource://" + getPackageName() + "/" + R.raw.merizindagi, R.drawable.woman , "Arya raj"));
        arrayList.add(new Model( "android.resource://" + getPackageName() + "/" + R.raw.tumkobarish, R.drawable.woman , "Arya raj"));
        arrayList.add(new Model( "android.resource://" + getPackageName() + "/" + R.raw.wed, R.drawable.woman , "Arya raj"));
        arrayList.add(new Model( "android.resource://" + getPackageName() + "/" + R.raw.asectics, R.drawable.woman , "Arya raj"));
        arrayList.add(new Model( "android.resource://" + getPackageName() + "/" + R.raw.kk, R.drawable.woman , "Arya raj"));
        adapter = new Adapter(MainActivity.this , arrayList);
        binding.vpg2.setAdapter(adapter);
    }
}