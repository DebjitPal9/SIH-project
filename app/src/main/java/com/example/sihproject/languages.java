package com.example.sihproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class languages extends AppCompatActivity {
    public static String MSG="com.example.sihproject.sih";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_languages);
    }
    public void totamil(View view){
        Intent intent=new Intent(this,LastScreen.class);
        intent.putExtra(MainActivity.MSG,"convertT");
        startActivity(intent);
    }
    public void tohindi(View view){
        Intent intent=new Intent(this,LastScreen.class);
        intent.putExtra(MainActivity.MSG,"covertH");
        startActivity(intent);
    }
    public void tobengali(View view){
        Intent intent=new Intent(this,LastScreen.class);
        intent.putExtra(MainActivity.MSG,"convertB");
        startActivity(intent);
    }
}