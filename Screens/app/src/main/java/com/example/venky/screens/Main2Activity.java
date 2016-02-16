package com.example.venky.screens;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {
    Button n;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        n = (Button)findViewById(R.id.button);
        n.setOnClickListener(this);
        Bundle b = getIntent().getExtras();
        if(b!=null){
            Toast.makeText(Main2Activity.this, b.getString("data"), Toast.LENGTH_SHORT).show();
        }
    }
    @Override
    public void onClick(View v){
        switch(v.getId()){
            case R.id.button:
                Intent asd1 = new Intent(this, MainActivity.class);
//                asd.putExtra("data",num.getText().toString());
                startActivity(asd1);
        }
    }

}
