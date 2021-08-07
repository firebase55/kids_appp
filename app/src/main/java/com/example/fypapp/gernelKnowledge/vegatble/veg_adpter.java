package com.example.fypapp.gernelKnowledge.vegatble;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.example.fypapp.R;

public class veg_adpter extends PagerAdapter {
    private LayoutInflater layoutInflater;
    private Context context;

    private Integer [] image =
            {
                    R.drawable.appricot_fruit,
                    R.drawable.banana_img,
                    R.drawable.chery_fruit,
                    R.drawable.mango_fruit,
                    R.drawable.orange_fruite,
                    R.drawable.pineapple_fruits,
                    R.drawable.pomegrenate_fruit,
                    R.drawable.watermelon_fruit,
                    // number

            };
    public veg_adpter
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
        View view = layoutInflater.inflate(R.layout.veg_layout,null);
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
