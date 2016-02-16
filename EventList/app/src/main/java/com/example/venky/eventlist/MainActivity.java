package com.example.venky.eventlist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText event_Name;
    EditText event_Desc;
    EditText event_Location;
    EditText event_Date;
    Button event_Save;
    Button event_View;
    DBhelper db_Object;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        event_Name = (EditText)findViewById(R.id.event_Name);
        event_Desc = (EditText)findViewById(R.id.event_Desc);
        event_Location = (EditText)findViewById(R.id.event_Location);
        event_Date = (EditText)findViewById(R.id.event_Date);
        event_Save = (Button)findViewById(R.id.event_Save);
        event_View = (Button)findViewById(R.id.event_View);
        db_Object = new DBhelper(getApplicationContext(),null,null,1);
        event_Save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Event obj = new Event(event_Name.getText().toString(),event_Desc.getText().toString(),event_Location.getText().toString(),event_Date.getText().toString());
                db_Object.addEvent(obj);
//                Toast.makeText(MainActivity.this, a, Toast.LENGTH_SHORT).show();
            }
        });

        event_View.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent display_page = new Intent(getApplicationContext(),Main2Activity.class);
                startActivity(display_page);

            }
        });

    }
}
