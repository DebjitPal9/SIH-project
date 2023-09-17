package com.example.sihproject;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static final String MSG="com.example.sihproject.sih";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void text(View view){
        Intent intent=new Intent(this,textActivity.class);
        intent.putExtra(MSG,"text");
        startActivity(intent);
    }
    public void word(View view){
        Intent intent=new Intent(this,wordActivity.class);
        intent.putExtra(MSG,"word");
        startActivity(intent);
    }
    public void image(View view){
        Intent intent=new Intent(this,imageActivity.class);
        intent.putExtra(MSG,"image");
        startActivity(intent);
    }
}