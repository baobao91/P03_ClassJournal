package com.example.a126308.p03_classjournal;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    ArrayList<String> module;
    ArrayAdapter<String> aa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = (ListView)findViewById(R.id.lvModule);
        module = new ArrayList<String>();
        module.add("C347");

        aa = new ArrayAdapter(this, android.R.layout.simple_list_item_1, module);
        lv.setAdapter(aa);
//ggg
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedHolidays = module.get(position);
                Intent intent = new Intent( getBaseContext(), Info.class);
                intent.putExtra("Holidays",selectedHolidays.toString());

//
//aa

                startActivity(intent);
            }
        });

    };
}
