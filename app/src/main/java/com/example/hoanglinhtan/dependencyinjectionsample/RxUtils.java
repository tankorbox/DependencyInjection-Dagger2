package com.example.hoanglinhtan.dependencyinjectionsample;

import android.content.Context;
import android.util.Log;

/**
 * Created by hoanglinhtan on 08/11/2017.
 */

public class RxUtils extends RxUtilAbs {
    Context context;
    public RxUtils(Context context) {
        this.context = context;
        Log.i("tag1","rx util contructor");
    }
    public String get() {
        return "hehe";
    }
}
