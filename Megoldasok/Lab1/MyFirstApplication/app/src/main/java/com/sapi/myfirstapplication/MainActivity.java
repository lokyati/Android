package com.sapi.myfirstapplication;

import android.app.Activity;
//import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Letrehozas kodbol
        //TextView t = new TextView(this);
        //t.setText("alma");
        //setContentView(t);

        setContentView(R.layout.activity_main);
        final TextView tv  = (TextView)findViewById(R.id.text1);
        //tv.setOnClickListener((View)v -> {

        //});
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.append("\n" + tv.getText());
            }
        });



    }

    public void buttonClicked(View v) {
        Button btn = (Button) findViewById(R.id.button);
        //Toast.makeText(this, "Megnyomtad a gombot!", Toast.LENGTH_SHORT).show();
        //gomb1.setTextColor(Color.GREEN);
        btn.setText("Új felirat");

    }

}
