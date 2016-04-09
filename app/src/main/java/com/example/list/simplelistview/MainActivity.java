package com.example.list.simplelistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //get   ListView object from xml
        listView = (ListView) findViewById(R.id.list);

        String[] values = new String[]{
                "Android List View",
                "Adapter Implementation",
                "Simple List view In Android",
                "Create List View In Android",
                "Android Example",
                "List View Source Code",
                "List View Array Adapter",
                "Android Example List View"
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,
                android.R.id.text1, values);

        //Assign adapter to listview
        listView.setAdapter(adapter);

        //listView Item click listener
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),
                        "Position : "+ position + "ListView : "+ (String)listView.getItemAtPosition(position),Toast.LENGTH_SHORT)
                        .show();
            }
        });

    }
}
