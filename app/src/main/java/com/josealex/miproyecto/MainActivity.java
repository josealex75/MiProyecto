package com.josealex.miproyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToActivitySecond(View View){
        Intent newintent = new Intent(this, SecondActivity.class);
        newintent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        newintent.putExtra("msg","Hola");
        newintent.putExtra("year","2021");
        startActivity(newintent);
    }

    @Override
    protected void onResume(){
        super.onResume();
        Toast.makeText(this,"onResume",Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onPause(){
        super.onPause();
        Toast.makeText(this,"onPause",Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Toast.makeText(this,"onDestroy",Toast.LENGTH_LONG).show();
    }
}