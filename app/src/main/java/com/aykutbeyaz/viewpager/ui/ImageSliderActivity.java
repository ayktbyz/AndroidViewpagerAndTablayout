package com.aykutbeyaz.viewpager.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.aykutbeyaz.viewpager.R;
import com.aykutbeyaz.viewpager.adapter.ImageViewPager;
import com.aykutbeyaz.viewpager.adapter.PageViewPager;
import com.aykutbeyaz.viewpager.fragment.AboutFragment;
import com.aykutbeyaz.viewpager.fragment.ContactFragment;
import com.aykutbeyaz.viewpager.fragment.HomeFragment;
import com.google.android.material.tabs.TabLayout;

public class ImageSliderActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private TabLayout tabLayout;
    private ImageViewPager imageViewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_slider);
        initializeFragment();
    }

    private void initializeFragment() {
        viewPager = findViewById(R.id.image_slider_viewPager);
        tabLayout = findViewById(R.id.image_slider_tabLayout);
        imageViewPager = new ImageViewPager(this);

        imageViewPager.addColor(R.color.black);
        imageViewPager.addColor(R.color.yellow);
        imageViewPager.addColor(R.color.red);

        viewPager.setAdapter(imageViewPager);
        tabLayout.setupWithViewPager(viewPager);
    }
}