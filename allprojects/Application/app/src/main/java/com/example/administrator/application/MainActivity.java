package com.example.administrator.application;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View v)
    {
        EditText ed1 = (EditText)findViewById(R.id.editText3);
        EditText ed2 = (EditText)findViewById(R.id.editText4);
        Button b1 = (Button)findViewById(R.id.button2);


        if (ed1.getText().equals("sai@gleecus.com") && ed2.getText().equals("sai"))
        {
            Intent intent = new Intent(this, ListViewActivity.class);
            //EditText edittext = (EditText) findViewById(R.id.);
            //String message = edittext.getText().toString();
            //intent.putExtra(EXTRA_MESSAGE, message);

            startActivity(intent);
        }

        else
        {
            System.out.println("details are wrong");
        }

    }















}
}
