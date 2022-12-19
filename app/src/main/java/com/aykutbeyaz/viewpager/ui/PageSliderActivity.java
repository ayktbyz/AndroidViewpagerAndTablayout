package com.aykutbeyaz.viewpager.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.aykutbeyaz.viewpager.R;
import com.aykutbeyaz.viewpager.adapter.PageViewPager;
import com.aykutbeyaz.viewpager.fragment.AboutFragment;
import com.aykutbeyaz.viewpager.fragment.ContactFragment;
import com.aykutbeyaz.viewpager.fragment.HomeFragment;

public class PageSliderActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private TabLayout tabLayout;
    private PageViewPager pageViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_slider);
        initializeFragment();
    }

    private void initializeFragment() {
        viewPager = findViewById(R.id.page_slider_viewPager);
        tabLayout = findViewById(R.id.page_slider_tabLayout);
        pageViewPager = new PageViewPager(getSupportFragmentManager());

        pageViewPager.addFragment(new HomeFragment(),getString(R.string.app_home_name));
        pageViewPager.addFragment(new AboutFragment(),getString(R.string.app_about_name));
        pageViewPager.addFragment(new ContactFragment(),getString(R.string.app_contact_name));

        viewPager.setAdapter(pageViewPager);
        tabLayout.setupWithViewPager(viewPager);
    }
}