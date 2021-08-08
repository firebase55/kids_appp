package com.example.fypapp.applocker.ui.model;

public class BlockedList {
    private String packageName;

    public BlockedList() {
    }

    public BlockedList(String packageName) {
        this.packageName = packageName;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }
}
