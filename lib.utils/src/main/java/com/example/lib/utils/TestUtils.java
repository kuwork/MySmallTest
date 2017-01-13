package com.example.lib.utils;

import android.content.Context;
import android.widget.Toast;

public class TestUtils {
    public static void showToast(Context context,String str) {
        Toast.makeText(context,str,1000).show();
    }
}