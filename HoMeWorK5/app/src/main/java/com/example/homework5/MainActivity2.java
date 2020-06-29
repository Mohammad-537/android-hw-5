package com.example.homework5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.renderscript.Sampler;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private TextView N10;
    private TextView N20;
    private TextView N30;
    private TextView N40;
    private TextView N50;
    private String ST;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
       N10 =  findViewById(R.id.N10);
       N20 =  findViewById(R.id.N20);
       N30 =  findViewById(R.id.N30);
       N40 =  findViewById(R.id.N40);
       N50 =  findViewById(R.id.N50);

       Bundle i = getIntent().getExtras();


        N10.setText(i.getString("Value"));

        N20.setText(i.getString("Value1"));

        N30.setText(i.getString("Value2"));

        N40.setText(i.getString("Value3"));

        N50.setText(i.getString("Value4"));




    }
}