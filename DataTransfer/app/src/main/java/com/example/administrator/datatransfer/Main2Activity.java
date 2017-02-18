package com.example.administrator.datatransfer;

import android.content.Intent;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import static android.R.attr.name;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView nameText = (TextView) findViewById(R.id.textviewnew);
        Bundle bundle = getIntent().getExtras();
        String name = bundle.getString("myname");
        nameText.setText("name:  " + name);
    }
}
