package com.example.administrator.listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;
   //import android.R;

public class GridViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gridview);

        GridView gridView = (GridView) findViewById(R.id.gridview);

       gridView.setAdapter(new ImageAdapter(this));


        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {
              //  Toast.makeText(GridViewActivity.this, "" + position, Toast.LENGTH_SHORT).show();

                Intent i1=new Intent(GridViewActivity.this,RecyclerActivity.class);
                startActivity(i1);

            }
        });

    }


}

