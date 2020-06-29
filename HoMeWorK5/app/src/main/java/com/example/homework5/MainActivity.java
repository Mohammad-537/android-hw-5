package com.example.homework5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText N1;
    private EditText N2;
    private EditText N3;
    private EditText N4;
    private EditText N5;
    private Button N6;
    private String ST;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button NEXT = findViewById(R.id.N6);
        N1=findViewById(R.id.N1);
        N2=findViewById(R.id.N2);
       N3 = findViewById(R.id.N3);
        N4 = findViewById(R.id.N4);
       N5 =  findViewById(R.id.N5);
       N6 =  findViewById(R.id.N6);









        NEXT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,MainActivity2.class);
                startActivity(i);
                ST=N1.getText().toString();
                i.putExtra("Value",ST);
                startActivity(i);
                finish();
                ST=N2.getText().toString();
                i.putExtra("Value1",ST);
                startActivity(i);
                finish();

                ST=N3.getText().toString();
                i.putExtra("Value2",ST);
                startActivity(i);
                finish();

                ST=N4.getText().toString();
                i.putExtra("Value3",ST);
                startActivity(i);
                finish();

                ST=N5.getText().toString();
                i.putExtra("Value4",ST);
                startActivity(i);
                finish();







            }
        });


    }
}