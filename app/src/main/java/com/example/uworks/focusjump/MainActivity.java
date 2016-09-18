package com.example.uworks.focusjump;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView listView1,listView2,listView3;
    List<String> data;
    ArrayAdapter adapter1;
    ArrayAdapter adapter2;
    ArrayAdapter adapter3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();
        setListener();
    }
    private void initView(){
        listView1 = (ListView) findViewById(R.id.listveiw1);
        listView2 = (ListView) findViewById(R.id.listveiw2);
        listView3 = (ListView) findViewById(R.id.listveiw3);
    }
    private void initData(){
        data = new ArrayList<>();
        adapter1 = new ArrayAdapter(this, R.layout.support_simple_spinner_dropdown_item);
        adapter2 = new ArrayAdapter(this, R.layout.support_simple_spinner_dropdown_item);
        adapter3 = new ArrayAdapter(this, R.layout.support_simple_spinner_dropdown_item);
        for (int i= 0;i<10;i++){
            data.add("listview 1 "+i);
        }
        adapter1.addAll(data);
        listView1.setAdapter(adapter1);
        data.clear();
        for (int i= 0;i<10;i++){
            data.add("listview 2 "+i);
        }
        adapter2.addAll(data);
        listView2.setAdapter(adapter2);
        data.clear();
        for (int i= 0;i<10;i++){
            data.add("listview 3 "+i);
        }
        adapter3.addAll(data);
        listView3.setAdapter(adapter3);
    }
    private void setListener(){
        listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                listView2.requestFocus();
            }
        });
    }
}
