package com.example.fypapp.gernelKnowledge.animalsdata;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.example.fypapp.R;

public class animalclass extends PagerAdapter {
    private LayoutInflater layoutInflater;
    private Context context;

    private Integer [] image =
            {
                    R.drawable.cat_img,
                    R.drawable.elephant_image,
                    R.drawable.horse_img,
                    R.drawable.lion_img,
                    R.drawable.monkey_img,
                    R.drawable.rabbit_img,
                    R.drawable.tortoise_img,
                    R.drawable.zebra_img,

            };
    public animalclass
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
        View view = layoutInflater.inflate(R.layout.animal_layout,null);
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
        viewPager.removeView(view);
    }
}
