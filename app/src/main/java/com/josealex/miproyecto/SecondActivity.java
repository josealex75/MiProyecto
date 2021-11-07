package com.josealex.miproyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Toast.makeText(getApplicationContext(), "onCreate",Toast.LENGTH_LONG).show();
        getParametro();
    }

    public void getParametro(){
        Bundle Extras = getIntent().getExtras();
        String msg = Extras.getString("msg");
        int year = Extras.getInt("year");
        Toast.makeText(this,msg+ " "+year, Toast.LENGTH_LONG).show();
    }

    public void goToActivityMain(View View){
        Intent newintent = new Intent(this, MainActivity.class);
        newintent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(newintent);
    }

}