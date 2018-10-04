package com.example.test.utils;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.util.Log;
import android.widget.Toast;

public class UtilMethods {
    private static class SingletonHolder {
        static UtilMethods instance = new UtilMethods();
    }

    public static UtilMethods getInstance() {
        return SingletonHolder.instance;
    }

    public void showToast(String message) {
        Toast.makeText(MyApp.getAppContext(), message, Toast.LENGTH_LONG).show();
    }

    public boolean isNetworkAvailable() {
        ConnectivityManager connectivityManager = (ConnectivityManager) MyApp.getAppContext().getSystemService(Context.CONNECTIVITY_SERVICE);
        assert connectivityManager != null;
        return connectivityManager.getActiveNetworkInfo() != null && connectivityManager.getActiveNetworkInfo().isConnected();
    }

    public void logger(String className, Throwable e) {
        Log.e(className, e.getMessage());
        e.printStackTrace();
    }

    public void launchWebUrl(String url) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(url));
        MyApp.getAppContext().startActivity(intent);
    }
}
