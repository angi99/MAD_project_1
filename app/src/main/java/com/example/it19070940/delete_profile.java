package com.example.it19070940;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class delete_profile extends AppCompatActivity {
    private Button btn;
    private Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete_profile);


        btn = (Button) findViewById(R.id.confirmDelUser);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(delete_profile.this, profile_deleted.class);
                startActivity(i);

            }


        });

        btn1 = (Button) findViewById(R.id.button7);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(delete_profile.this, rooms.class);
                startActivity(i);

            }


        });
    }
}