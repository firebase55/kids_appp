package com.example.fypapp.applocker.ui.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


import com.example.fypapp.applocker.ui.model.MyPager;

import java.util.ArrayList;

public class MyPagerAdapter extends FragmentStatePagerAdapter {
    private ArrayList<MyPager> pagerList;

    public MyPagerAdapter(@NonNull FragmentManager fm, int behavior , ArrayList<MyPager> pagerList) {
        super(fm, behavior);
        this.pagerList = pagerList;

    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return pagerList.get(position).getFragment();
    }

    @Override
    public int getCount() {
        return pagerList.size();
    }

}
