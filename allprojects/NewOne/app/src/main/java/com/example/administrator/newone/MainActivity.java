package com.example.administrator.newone;

import android.content.ClipData;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initializing list view with the custom adapter
        ArrayList <ClipData.Item> itemList = new ArrayList<ClipData.Item>();

        ItemArrayAdapter itemArrayAdapter = new ItemArrayAdapter(R.layout.list_item, itemList);
        recyclerView = (RecyclerView) findViewById(R.id.item_list);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(itemArrayAdapter);

        // Populating list items
        for(int i=0; i<100; i++) {
            itemList.add(new ClipData.Item("Item " + i));
        }

    }
}
