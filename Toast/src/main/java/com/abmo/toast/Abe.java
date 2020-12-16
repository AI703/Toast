package com.abmo.toast;

import android.content.Context;

public class Abe {

    public static void show(Context context,String message,int duration){

        android.widget.Toast.makeText(context, message, duration).show();

    }
}
