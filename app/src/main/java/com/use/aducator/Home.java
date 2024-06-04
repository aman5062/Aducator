package com.use.aducator;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

public class Home extends AppCompatActivity {
    Dialog dialog;
    ImageView menu_opener,profile_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        getSupportActionBar().hide();
        menu_opener = findViewById(R.id.menu_opener);
        profile_btn = findViewById(R.id.profile_btn);


        profile_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this,profile.class);
                startActivity(intent);
            }
        });
        menu_opener.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog = new Dialog(Home.this);
                dialog.setContentView(R.layout.menu);
                dialog.setCancelable(true);
                dialog.getWindow().setLayout(WindowManager.LayoutParams.MATCH_PARENT,WindowManager.LayoutParams.MATCH_PARENT);
                dialog.getWindow().getAttributes().windowAnimations = R.style.Theme_Aducator;
                dialog.getWindow().setBackgroundDrawableResource(android.R.drawable.screen_background_light_transparent);
                dialog.show();
            }
        });

    }
}