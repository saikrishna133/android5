package com.example.administrator.tablelayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = sai;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText editText1 = (EditText) findViewById(R.id.edit1);
        final EditText editText2 =  (EditText) findViewById(R.id.edit2);
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View args0) {

                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                String message = editText1.getText().toString();
                String string = editText2.getText().toString();
                intent.putExtra(EXTRA_MESSAGE,message);
                intent.putExtra(,string);
                startActivity(intent);

            }
        });











    }
}
