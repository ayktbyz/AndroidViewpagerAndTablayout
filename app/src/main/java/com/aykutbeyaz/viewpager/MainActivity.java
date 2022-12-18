package com.aykutbeyaz.viewpager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.aykutbeyaz.viewpager.ui.ImageSliderActivity;
import com.aykutbeyaz.viewpager.ui.PageSliderActivity;
import com.aykutbeyaz.viewpager.ui.TextSliderActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        findViewById(R.id.btn_image_slider).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ImageSliderActivity.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.btn_page_slider).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, PageSliderActivity.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.btn_text_slider).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, TextSliderActivity.class);
                startActivity(intent);
            }
        });
    }
}