package com.example.sihproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class textActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text);

    }
    public void language(View view){
        Intent intent=new Intent(this, languages.class);
        intent.putExtra(MainActivity.MSG,"text");
        startActivity(intent);
    }
}