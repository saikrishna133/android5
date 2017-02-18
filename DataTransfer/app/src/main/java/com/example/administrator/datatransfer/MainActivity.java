package com.example.administrator.datatransfer;

import android.content.Intent;
import android.support.annotation.IntegerRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      final   EditText ed1 = (EditText) findViewById(R.id.name1);
        Button button = (Button) findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){

                String  name =ed1.getText().toString();

                Bundle bn = new Bundle();
                bn.putString("myname",name);
                Intent sending =new Intent(MainActivity.this,Main2Activity.class);

                sending.putExtras(bn);
                // sending.putExtra("mail","vamshi.sai.9866@gmail.com");
                //sending.setType("text/plain");
                startActivity(sending);
            }});










    }
}
