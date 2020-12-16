package com.abmo.toast;

import android.content.Context;

public class Toast {

    public static void show(Context context,String message,int duration){

        android.widget.Toast.makeText(context, message, duration).show();

    }
}
