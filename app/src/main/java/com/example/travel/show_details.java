package com.example.travel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class show_details extends AppCompatActivity {

    public Button button;
    ImageButton myImageButton;
    ImageButton myImageButton1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_details);

        myImageButton =(ImageButton) findViewById(R.id.imageButton4);

        myImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentt = new Intent (show_details.this,confirm_booking.class);
                startActivity(intentt);
            }
        });

        myImageButton1 =(ImageButton) findViewById(R.id.imageButton);

        myImageButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentt = new Intent (show_details.this,MainActivity.class);
                startActivity(intentt);
            }
        });

        button = (Button) findViewById(R.id.button2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (show_details.this,booked.class);
                startActivity(intent);
            }
        });

    }
}