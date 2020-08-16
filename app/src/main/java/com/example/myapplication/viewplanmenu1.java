package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class viewplanmenu1 extends AppCompatActivity {

    private Button button;
    private Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewplanmenu);

        button= (Button) findViewById(R.id.viewfull);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMenu();
            }
        });
        button1= (Button) findViewById(R.id.editplan);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMenu1();
            }
        });
    }

    public void openMenu(){
        Intent intent =new Intent(this, view1.class);
        startActivity(intent);
    }
    public void openMenu1(){
        Intent intent =new Intent(this, editplan.class);
        startActivity(intent);
    }
}