package com.example.fypapp.gernelKnowledge.mathsActivity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.example.fypapp.R;

public class maths_adpter extends PagerAdapter {
    private LayoutInflater layoutInflater;
    private Context context;

    private Integer [] image =
            {
                    R.drawable.img_table_2,
                    R.drawable.img_table_3,
                    R.drawable.img_table_4,
                    R.drawable.img_table_5,
                    R.drawable.img_table_6,
                    R.drawable.img_table_7,
                    R.drawable.img_table_8,
                    R.drawable.img_table_9,
                    R.drawable.img_table_10,


            };
    public maths_adpter
            (Context context) {
        this.context = context;
    }
    @Override
    public int getCount() {
        return image.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view==object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        layoutInflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.maths_layout,null);
        ImageView imageView = (ImageView) view.findViewById(R.id.imageid);
        imageView.setImageResource(image[position]);
        ViewPager viewPager = (ViewPager)container;
        viewPager.addView(view);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        ViewPager viewPager = (ViewPager)container;
        View view = (View)object;
        viewPager.removeView(view);    }
}
