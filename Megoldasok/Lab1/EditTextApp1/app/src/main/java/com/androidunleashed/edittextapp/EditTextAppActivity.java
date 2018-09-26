package com.androidunleashed.edittextapp;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;
import android.view.View.OnKeyListener;
import android.view.KeyEvent;

public class EditTextAppActivity extends Activity {
     
     @Override
     public void onCreate(Bundle savedInstanceState) {
          super.onCreate(savedInstanceState);
          setContentView(R.layout.activity_edit_text_app);
          final TextView resp = (TextView)this.findViewById(R.id.response);
          final EditText username = (EditText) findViewById(R.id.user_name);
          username.setOnKeyListener(new OnKeyListener() {
               public boolean onKey(View v, int keyCode, KeyEvent event) {
                      if ((event.getAction() == KeyEvent.ACTION_UP) && (keyCode == 
                         KeyEvent.KEYCODE_ENTER)) {
                       resp.setText("Welcome "+username.getText()+" !");
                          Log.i("MyAcivity", "Welcome "+username.getText()+" !");
                         return true;
                    }
                    return false;
               }
          });

         username.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {

             }
         });
     }
}
