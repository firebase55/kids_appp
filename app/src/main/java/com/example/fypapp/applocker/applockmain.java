package com.example.fypapp.applocker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;

import android.app.ActivityManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.util.Log;

import com.example.fypapp.R;
import com.example.fypapp.applocker.service.MyBlockService;
import com.example.fypapp.applocker.ui.BlockAppsFragment;
import com.example.fypapp.applocker.ui.HistoryFragment;
import com.example.fypapp.applocker.ui.model.MyPager;
import com.example.fypapp.applocker.ui.util.GlobalMethods;
import com.example.fypapp.databinding.ActivityApplockmainBinding;
import com.example.fypapp.databinding.ActivityMain3Binding;
import java.util.ArrayList;
public class applockmain extends AppCompatActivity {
    private ActivityApplockmainBinding binding;
    private ArrayList<MyPager> pagerArrayList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this , R.layout.activity_applockmain);

        //wrapData();
        //setupViewPager();

        if(savedInstanceState == null){
            getSupportFragmentManager().beginTransaction().add(R.id.frag_container , new BlockAppsFragment())
                    .commit();
        }
    }


/*
    private void setupViewPager(){
        binding.viewPager.setAdapter(new MyPagerAdapter(getSupportFragmentManager() , 0 , pagerArrayList));
        binding.tabLayout.setupWithViewPager(binding.viewPager);

        binding.tabLayout.getTabAt(0).setIcon(R.drawable.ic_apps);
        binding.tabLayout.getTabAt(1).setIcon(R.drawable.ic_history);


    }
*/

    private void wrapData(){
        pagerArrayList.add(new MyPager(R.drawable.ic_apps , new BlockAppsFragment()));
        pagerArrayList.add(new MyPager(R.drawable.ic_history , new HistoryFragment()));
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (GlobalMethods.hasUsageStatsPermission(this)){
            startService();
        }else if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            if (!Settings.canDrawOverlays(this)) {
                Intent intent = new Intent(Settings.ACTION_MANAGE_OVERLAY_PERMISSION, Uri.parse("package:" + getPackageName()));
                startActivityForResult(intent, 0);
            } else {
                GlobalMethods.requestUsageStatsPermission(this);
            }
        }


    }

    @Override
    protected void onStart() {
        super.onStart();

    }

    private void startService(){
        Intent intent = new Intent(applockmain.this , MyBlockService.class);

        if (!checkServiceRunning(MyBlockService.class)){
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                Log.d("TAG" , "Service Started");
                ContextCompat.startForegroundService(applockmain.this , intent);
            } else {
                Log.d("TAG" , "Service Stopped");
                startService(intent);
            }
        }
    }

    private boolean checkServiceRunning(Class<?> serviceClass){
        ActivityManager manager = (ActivityManager) getSystemService(ACTIVITY_SERVICE);
        for (ActivityManager.RunningServiceInfo service : manager.getRunningServices(Integer.MAX_VALUE))
        {
            if (serviceClass.getName().equals(service.service.getClassName()))
            {
                return true;
            }
        }
        return false;
    }
}