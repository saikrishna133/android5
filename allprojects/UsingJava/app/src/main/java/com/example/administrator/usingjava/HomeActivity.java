package com.example.administrator.usingjava;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class HomeActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }
    public void onClick(View v)
    {
        EditText ed1 = (EditText)findViewById(R.id.editText3);
        EditText ed2 = (EditText)findViewById(R.id.editText4);
     Button   b1 = (Button) findViewById(R.id.button2);


        if (ed1.getText().equals("sai@gleecus.com") && ed2.getText().equals("sai"))
        {
            System.out.println("details are correct");
        }

        else
        {
            System.out.println("details are wrong");
        }

    }

}

