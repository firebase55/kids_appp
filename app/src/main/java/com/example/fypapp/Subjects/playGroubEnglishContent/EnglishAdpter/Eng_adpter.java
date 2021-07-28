package com.example.fypapp.Subjects.playGroubEnglishContent.EnglishAdpter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.example.fypapp.R;

public class Eng_adpter extends PagerAdapter {
    private LayoutInflater layoutInflater;
    private Context context;

    private Integer [] image =
            {
                    R.drawable.img_a,
                    R.drawable.img_b,
                    R.drawable.img_c,
                    R.drawable.img_d,
                    R.drawable.img_e,
                    R.drawable.img_f,
                    R.drawable.img_g,
                    R.drawable.img_h,
                    R.drawable.img_i,
                    R.drawable.img_k,
                    R.drawable.img_l,
                    R.drawable.img_m,
                    R.drawable.img_n,
                    R.drawable.img_o,
                    R.drawable.img_k,
                    R.drawable.img_p,
                    R.drawable.img_q,
                    R.drawable.img_r,
                    R.drawable.img_s,
                    R.drawable.img_t,
                    R.drawable.u_img,
                    R.drawable.v_img,
                    R.drawable.w_img,
                    R.drawable.x_img,
                    R.drawable.y_img,
                    R.drawable.z_img,



            };
////

    public Eng_adpter(Context context) {
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
        View view = layoutInflater.inflate(R.layout.custem_layout,null);
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
