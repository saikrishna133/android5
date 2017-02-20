package com.example.administrator.listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ListViewActivity extends AppCompatActivity {

    String[] mobileArray = {"Android", "IPhone", "WindowsMobile", "Blackberry",
            "WebOS", "Ubuntu", "Windows7", "Max OS X"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);

      //  String[] mobileList = {"iphone", "blackberry", "sony", "samsung", "redmi"};
        Intent intent = getIntent();
        ArrayAdapter adapter = new ArrayAdapter<String>(this, R.layout.activity_list, mobileArray);
        ListView list = (ListView) findViewById (R.id.mobile_list);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {
               // Toast.makeText(ListViewActivity.this, "" + position, Toast.LENGTH_SHORT).show();
                Intent i = new Intent(ListViewActivity.this,GridViewActivity.class);
                startActivity(i);
            }
        });




    }

}