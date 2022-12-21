package com.aykutbeyaz.viewpager.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.aykutbeyaz.viewpager.R;
import com.aykutbeyaz.viewpager.adapter.ImageViewPager;
import com.aykutbeyaz.viewpager.adapter.TextViewPager;
import com.aykutbeyaz.viewpager.model.TextModel;
import com.google.android.material.tabs.TabLayout;

public class TextSliderActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private TabLayout tabLayout;
    private TextViewPager textViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_slider);
        initializeFragment();
    }

    private void initializeFragment() {
        viewPager = findViewById(R.id.text_slider_viewPager);
        tabLayout = findViewById(R.id.text_slider_tabLayout);
        textViewPager = new TextViewPager(this);

        textViewPager.addText(new TextModel("Aykut Beyaz","Software Developer"));
        textViewPager.addText(new TextModel("Android Slider","Android Tab Layout"));
        textViewPager.addText(new TextModel("Android Image","Android Text"));

        viewPager.setAdapter(textViewPager);
        tabLayout.setupWithViewPager(viewPager);
    }
}