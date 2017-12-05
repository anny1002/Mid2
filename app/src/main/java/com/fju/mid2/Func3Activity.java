package com.fju.mid2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class Func3Activity extends AppCompatActivity {
    public final int REQUEST_F3=3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_func3);
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this,"特殊功能",Toast.LENGTH_LONG).show();
    }
}
