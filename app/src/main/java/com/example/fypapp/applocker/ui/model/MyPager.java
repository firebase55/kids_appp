package com.example.fypapp.applocker.ui.model;

import androidx.fragment.app.Fragment;

public class MyPager {
    private int drawable;
    private Fragment fragment;

    public MyPager(int drawable, Fragment fragment) {
        this.drawable = drawable;
        this.fragment = fragment;
    }

    public int getDrawable() {
        return drawable;
    }

    public void setDrawable(int drawable) {
        this.drawable = drawable;
    }

    public Fragment getFragment() {
        return fragment;
    }

    public void setFragment(Fragment fragment) {
        this.fragment = fragment;
    }
}
