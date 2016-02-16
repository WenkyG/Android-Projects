package com.example.venky.eventlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Main2Activity extends AppCompatActivity {
    ArrayAdapter<List> itemsAdapter;
    TextView list;
    EditText searchText;
    Button seacrh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        final DBhelper object = new DBhelper(getApplicationContext(),null,null,1);
        List<Event> res = object.displayEvents();

//        ArrayList<String> obj = new ArrayList<>(res);
        String t="";
        for(int i=0; i <res.size();i++){
            t = t+"<b> "+res.get(i).getEventName()+"</b>"+"<br>"+res.get(i).getEventDesc()+"<br>"+res.get(i).getEventLocation()+"<br>"+res.get(i).getEventDate()+"<br>";
        }
//        itemsAdapter = new ArrayAdapter<List>(this,android.R.layout.simple_list_item_1,obj);
        list = (TextView)findViewById(R.id.list);
        list.setText(Html.fromHtml(t));
        searchText = (EditText)findViewById(R.id.searchText);
        seacrh = (Button)findViewById(R.id.search);

        seacrh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                List<Event> res_loc = object.displayEvents();
                res_loc = object.byLocation(searchText.getText().toString());
                String t="";
                for(int i=0; i <res_loc.size();i++){
                    t = t+"<b> "+res_loc.get(i).getEventName()+"</b>"+"<br>"+res_loc.get(i).getEventDesc()+"<br>"+res_loc.get(i).getEventLocation()+"<br>"+res_loc.get(i).getEventDate()+"<br>";
                }
                list.setText(Html.fromHtml(t));

            }
        });

    }


}
