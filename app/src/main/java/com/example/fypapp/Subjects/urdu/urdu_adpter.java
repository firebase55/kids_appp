package com.example.fypapp.Subjects.urdu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.example.fypapp.R;

public class urdu_adpter extends PagerAdapter {
    private LayoutInflater layoutInflater;
    private Context context;

    private Integer[] image =
            {
                    R.drawable.alif,
                    R.drawable.alifaa,
                    R.drawable.bay,
                    R.drawable.pay,
                    R.drawable.tay,
                    R.drawable.say,
                    R.drawable.tay,
                    R.drawable.jim,
                    R.drawable.chy,
                    R.drawable.hay,


            };


    public urdu_adpter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return image.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.urdu_layout, null);
        ImageView imageView = (ImageView) view.findViewById(R.id.imageid);
        imageView.setImageResource(image[position]);
        ViewPager viewPager = (ViewPager) container;
        viewPager.addView(view);
        return view;

    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        ViewPager viewPager = (ViewPager) container;
        View view = (View) object;
        viewPager.removeView(view);
    }
}
