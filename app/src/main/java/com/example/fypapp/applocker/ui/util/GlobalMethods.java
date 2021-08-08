package com.example.fypapp.applocker.ui.util;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.app.AppOpsManager;
import android.app.usage.UsageStats;
import android.app.usage.UsageStatsManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.provider.Settings;
import android.util.Log;


import com.example.fypapp.applocker.ui.model.AppList;
import com.example.fypapp.applocker.ui.model.TinyDB;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;

public class GlobalMethods {


    public static List<AppList> getInstalledApps(Context context) {
        //PackageManager pm = context.getPackageManager();
        List<AppList> apps = new ArrayList<>();
        List<AppList> systemApps = getSystemApps(context);
        List<PackageInfo> packs = context.getPackageManager().getInstalledPackages(0);
        //List<PackageInfo> packs = getPackageManager().getInstalledPackages(PackageManager.GET_PERMISSIONS);
        for (int i = 0; i < packs.size(); i++) {
            PackageInfo p = packs.get(i);
            if ((!isSystemPackage(p))) {
                String appName = p.applicationInfo.loadLabel(context.getPackageManager()).toString();
                Drawable icon = p.applicationInfo.loadIcon(context.getPackageManager());
                String packages = p.applicationInfo.packageName;
                apps.add(new AppList(appName, icon, packages));

            }
        }
        apps.addAll(systemApps);
        return apps;
    }

    private static List<AppList> getSystemApps(Context context){
        List<AppList> apps = new ArrayList<>();
        List<PackageInfo> packs = context.getPackageManager().getInstalledPackages(0);
        //List<PackageInfo> packs = getPackageManager().getInstalledPackages(PackageManager.GET_PERMISSIONS);
        for (int i = 0; i < packs.size(); i++) {
            PackageInfo p = packs.get(i);
            if ((isSystemPackage(p))) {

                String appName = p.applicationInfo.loadLabel(context.getPackageManager()).toString();
                Drawable icon = p.applicationInfo.loadIcon(context.getPackageManager());
                String packages = p.applicationInfo.packageName;

                if (packages.equals(MyConstant.CHROME)){
                    apps.add(new AppList(appName, icon, packages));
                }else if (packages.equals(MyConstant.YOUTUBE)){
                    apps.add(new AppList(appName, icon, packages));
                }else if (packages.equals(MyConstant.PLAY_MUSIC)){
                    apps.add(new AppList(appName, icon, packages));
                }else if (packages.equals(MyConstant.PLAY_MOVIE)){
                    apps.add(new AppList(appName, icon, packages));
                }



            }
        }
        return apps;
    }

    private static boolean isSystemPackage(PackageInfo pkgInfo) {
        return (pkgInfo.applicationInfo.flags & ApplicationInfo.FLAG_SYSTEM) != 0;
    }

    public static ArrayList<String> getBlockList(Context context){
        TinyDB tinyDB = new TinyDB(context);
        return tinyDB.getListString(MyConstant.LOCKED);

    }
    public static void addAppToBlock(Context context , String app){
        TinyDB tinyDB = new TinyDB(context);
        ArrayList<String> listData = new ArrayList<>();
        ArrayList<String> list = tinyDB.getListString(MyConstant.LOCKED);

        if (list.isEmpty()){
            listData.add(app);
            tinyDB.putListString(MyConstant.LOCKED , listData);


        }else{
            listData.add(app);
            list.addAll(listData);
            tinyDB.putListString(MyConstant.LOCKED , list);

        }


    }

    public static void removeAppFromBlock(Context context , int position){
        TinyDB tinyDB = new TinyDB(context);

        ArrayList<String> list = tinyDB.getListString(MyConstant.LOCKED);

        if (!list.isEmpty()){
            list.remove(position);
            tinyDB.putListString(MyConstant.LOCKED , list);
        }

    }

    public static boolean isAppRunning(final Context context, final String packageName) {
        final ActivityManager activityManager = (ActivityManager) context.getSystemService(Context.ACTIVITY_SERVICE);
        final List<ActivityManager.RunningAppProcessInfo> procInfos = activityManager.getRunningAppProcesses();
        if (procInfos != null)
        {
            for (final ActivityManager.RunningAppProcessInfo processInfo : procInfos) {
                if (processInfo.processName.equals(packageName)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void requestUsageStatsPermission(Context context) {
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP
                && !hasUsageStatsPermission(context)) {
            context.startActivity(new Intent(Settings.ACTION_USAGE_ACCESS_SETTINGS));
        }
    }
    @TargetApi(Build.VERSION_CODES.KITKAT)
    public static boolean hasUsageStatsPermission(Context context) {
        AppOpsManager appOps = (AppOpsManager) context.getSystemService(Context.APP_OPS_SERVICE);
        int mode = appOps.checkOpNoThrow("android:get_usage_stats",
                android.os.Process.myUid(), context.getPackageName());
        boolean granted = mode == AppOpsManager.MODE_ALLOWED;
        return granted;
    }
    public static String printForegroundTask(Context context) {
        String currentApp = "NULL";
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            UsageStatsManager usm = (UsageStatsManager) context.getSystemService("usagestats");
            long time = System.currentTimeMillis();
            List<UsageStats> appList = usm.queryUsageStats(UsageStatsManager.INTERVAL_DAILY,  time - 1000*1000, time);
            if (appList != null && appList.size() > 0) {
                SortedMap<Long, UsageStats> mySortedMap = new TreeMap<Long, UsageStats>();
                for (UsageStats usageStats : appList) {
                    mySortedMap.put(usageStats.getLastTimeUsed(), usageStats);
                }
                if (mySortedMap != null && !mySortedMap.isEmpty()) {
                    currentApp = mySortedMap.get(mySortedMap.lastKey()).getPackageName();
                }
            }
        } else {
            ActivityManager am = (ActivityManager) context.getSystemService(Context.ACTIVITY_SERVICE);
            List<ActivityManager.RunningAppProcessInfo> tasks = am.getRunningAppProcesses();
            currentApp = tasks.get(0).processName;
        }

        Log.d("adil", "Current App in foreground is: " + currentApp);
        return currentApp;
    }

}
