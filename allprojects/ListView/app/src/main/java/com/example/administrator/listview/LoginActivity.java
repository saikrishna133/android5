package com.example.administrator.listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        EditText ed1 = (EditText) findViewById(R.id.editText3);
        EditText ed2 = (EditText) findViewById(R.id.editText4);
        Button b1 = (Button) findViewById(R.id.button2);

        b1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent intent = new Intent(LoginActivity.this, ListViewActivity.class);
                //EditText edittext = (EditText) findViewById(R.id.);
                //String message = edittext.getText().toString();
                //intent.putExtra(EXTRA_MESSAGE, message);

                startActivity(intent);
            }

        });


    }

}


