package com.example.travel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class confirm_booking extends AppCompatActivity {

    ImageButton myImageButton1;
    public Button button;
    public Button button1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm_booking);

        myImageButton1 =(ImageButton) findViewById(R.id.imageButton2);

        myImageButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentt = new Intent (confirm_booking.this,MainActivity.class);
                startActivity(intentt);
            }
        });

        button = (Button) findViewById(R.id.button4);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (confirm_booking.this,confirm.class);
                startActivity(intent);
            }
        });


        button1 = (Button) findViewById(R.id.button3);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (confirm_booking.this,remove.class);
                startActivity(intent);
            }
        });

    }
}