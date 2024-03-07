package com.app.firststore;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Second_layer_course extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_layer_course);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) ImageView bg = findViewById(R.id.bg2);

    }

    //----назад----//
    public void close(View view){
        finish();
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }


}