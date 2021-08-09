package com.example.fypapp.applocker.service;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Dialog;
import android.app.Notification;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;


import com.example.fypapp.R;
import com.example.fypapp.applocker.BlockMessageActivity;
import com.example.fypapp.applocker.app.MyApplication;
import com.example.fypapp.applocker.ui.util.GlobalMethods;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class MyBlockService extends Service {
    private Dialog dialog;
    String foregroundApp = null;
    public static final int NOTIFICATION_ID = 100;
    private boolean block = false;

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        displayNotification();
        checkAppRunning();
        return START_STICKY;

    }

    @Override
    public void onCreate() {
        super.onCreate();
        dialog = new Dialog(MyBlockService.this , R.style.Theme_AppCompat_Light);
        View view = LayoutInflater.from(this).inflate(R.layout.block_dialog , null);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            dialog.getWindow().setType(WindowManager.LayoutParams.TYPE_APPLICATION_OVERLAY);
        }else {
            dialog.getWindow().setType(WindowManager.LayoutParams.TYPE_SYSTEM_ALERT);

        }

        Button mCancel =view.findViewById(R.id.buttonCancel);
        mCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ActivityManager am = (ActivityManager) getSystemService(Activity.ACTIVITY_SERVICE);
                am.killBackgroundProcesses(foregroundApp);
                dialog.cancel();
            }
        });



        dialog.setContentView(view);



    }

    private void checkAppRunning(){

        Timer timer = new Timer();
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                Log.d("adil" , GlobalMethods.printForegroundTask(MyBlockService.this));
                foregroundApp = GlobalMethods.printForegroundTask(MyBlockService.this);
                stateDialog(foregroundApp);
            }
        };
        timer.scheduleAtFixedRate(timerTask,0,1000);




    }

    void displayDialog(){
        final Thread thread = new Thread(){
            public void run(){
                Looper.prepare();
                new Handler().post(new Runnable() {
                    @Override
                    public void run() {
                        /*if (block){
                            dialog.show();
                        }*/
                        Intent intent = new Intent(MyBlockService.this , BlockMessageActivity.class);
                        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP|Intent.FLAG_ACTIVITY_NEW_TASK|Intent.FLAG_ACTIVITY_SINGLE_TOP|Intent.FLAG_ACTIVITY_NO_HISTORY);
                        startActivity(intent);
                    }
                });
                Looper.loop();
            }
        };
        thread.start();
    }

    private void stateDialog(String name){
        if (name != null){
            ArrayList<String> blockList = GlobalMethods.getBlockList(MyBlockService.this);
            if (!blockList.isEmpty()){
                for (int j = 0; j < blockList.size(); j++){
                    if (name.contains(blockList.get(j))){
                        block = true;
                        displayDialog();
                        break;
                    }
                }
            }
        }

    }


    private void displayNotification(){
        Notification notification = new NotificationCompat.Builder(this, MyApplication.NOTIFICATION_CHANNEL)
                .setContentTitle("App Blocker")
                .setContentText("It will always show on the top.")
                .setSmallIcon(R.drawable.ic_apps)
                .build();
        startForeground(NOTIFICATION_ID, notification);
    }
}
