package com.fju.mid2;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Func1Activity extends AppCompatActivity {
    int n = (int) (Math.random()*6+1);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_func1);
    }
    public void number(View view){
        new AlertDialog.Builder(this)
                .setMessage(n)
                .setTitle("")
                .setPositiveButton("OK",null)
                .show();
    }
}
