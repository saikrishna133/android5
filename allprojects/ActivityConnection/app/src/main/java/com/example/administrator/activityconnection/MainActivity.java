package com.example.administrator.activityconnection;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.Button;
import android.widget.EditText;

import static android.R.id.message;
import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {
    public final static String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
   public void acceptMessage(View view)
   {
       Intent intent = new Intent(this, SecondActivity.class);
      EditText edittext = (EditText) findViewById(R.id.editText3);
       String message = edittext.getText().toString();
       intent.putExtra(EXTRA_MESSAGE, message);

       startActivity(intent);
   }
}









