package com.aykutbeyaz.viewpager.adapter;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class PageViewPager extends FragmentPagerAdapter {

    private ArrayList<String> nameArrayList;
    private ArrayList<Fragment> fragmentArrayList;

    public PageViewPager(FragmentManager fm) {
        super(fm);

        nameArrayList = new ArrayList<>();
        fragmentArrayList = new ArrayList<>();
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentArrayList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentArrayList.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return nameArrayList.get(position);
    }

    public void addFragment(Fragment fragment, String name){
        nameArrayList.add(name);
        fragmentArrayList.add(fragment);
    }

}
