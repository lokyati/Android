package com.sapi.addingnumbers;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText szam1 = (EditText)findViewById(R.id.editText1);
        final EditText szam2 = (EditText)findViewById(R.id.editText2);
        Button szamol = (Button) findViewById(R.id.button_szamol);
        final TextView tv = (TextView) findViewById(R.id.textView);

        //ToDo

    }
}
