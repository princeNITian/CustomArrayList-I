package com.example.prince.hsam9;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    ArrayList<Item> aL = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.simpleListView);
        aL.add(new Item("Prince",R.drawable.picf));
        aL.add(new Item("LearnByExample",R.drawable.learn));
        aL.add(new Item("Physics",R.drawable.physics));
        aL.add(new Item("Chemistry",R.drawable.chemistry));
        aL.add(new Item("Maths",R.drawable.math));

        MyAdapter myAdapter = new MyAdapter(this,R.layout.list_view_items,aL);
        listView.setAdapter(myAdapter);

    }
}
