package com.example.parkingmanager;

import android.content.Context;
import android.content.SharedPreferences;

public class SharedPrefrenceUtilities {

    //SharedPreference Key
    public static final String spIsLoggedin = "isLoggedin";
    public static final String spFirstName ="name";
    public static final String spEmail = "email";
    public static final String spUserId = "userId";
    public static final String spMobileNo = "mobileNo";

    //Store string using Shared Preference
    public static void setSPstring(Context mContext, String key, String value) {
        SharedPreferences pref =mContext.getSharedPreferences("MyPref", 0); 
    }
}