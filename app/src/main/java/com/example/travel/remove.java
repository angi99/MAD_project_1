package com.example.travel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class remove extends AppCompatActivity {

    ImageButton myImageButton1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_remove);

        myImageButton1 =(ImageButton) findViewById(R.id.imageButton7);

        myImageButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentt = new Intent (remove.this,MainActivity.class);
                startActivity(intentt);
            }
        });
    }
}