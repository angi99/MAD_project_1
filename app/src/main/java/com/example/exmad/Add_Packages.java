package com.example.exmad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Add_Packages extends AppCompatActivity {
private Button btn1;
    private Button btn2;
    private Button btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add__packages);


        btn1 = (Button) findViewById(R.id.viewb1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(Add_Packages.this, View_Packages.class);
                startActivity(i);

            }


        });

        btn2 = (Button) findViewById(R.id.viewb2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(Add_Packages.this, View_Packages.class);
                startActivity(i);

            }


        });

        btn3 = (Button) findViewById(R.id.viewb3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(Add_Packages.this, View_Packages.class);
                startActivity(i);

            }


        });
    }
}