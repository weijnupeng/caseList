package com.yq.pplication.mylibrary;

import android.content.Context;
import android.widget.Toast;

/**
 *@author: yq
 *@date: 2021/2/1
 *
 **/
public class T {

    public static void show(Context context,String str){
        Toast.makeText( context,str,Toast.LENGTH_LONG ).show();
    }
}
