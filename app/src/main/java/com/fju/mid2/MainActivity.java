package com.fju.mid2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private final int REQUEST_BACK=102;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void func1(View view){
        Intent F1=new Intent(this,Func1Activity.class);
        startActivity(F1);
    }
    public void func2(View view){
        Intent F2=new Intent(this,Func2Activity.class);
        startActivity(F2);
    }
    public void func3(View view){
        Intent F3=new Intent(this,Func3Activity.class);
        startActivity(F3);
    }
    public void func4(View view){
        Intent F4=new Intent(this,Func4Activity.class);
        startActivity(F4);
    }
    public void func5(View view){
        Intent F5=new Intent(this,Func5Activity.class);
        startActivity(F5);
    }
    public void func6(View view){
        Intent F6=new Intent(this,Func6Activity.class);
        startActivity(F6);
    }
    public void func7(View view){
        Intent F7=new Intent(this,Func7Activity.class);
        startActivity(F7);
    }
    public void func8(View view){
        Intent F8=new Intent(this,Func8Activity.class);
        startActivity(F8);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }
}
