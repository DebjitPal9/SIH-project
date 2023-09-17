package com.example.sihproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class wordActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word);
    }
    public void language(View view){
        Intent intent=new Intent(this, languages.class);
        intent.putExtra(MainActivity.MSG,"word");
        startActivity(intent);
    }
}