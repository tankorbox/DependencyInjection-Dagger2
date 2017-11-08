package com.example.hoanglinhtan.dependencyinjectionsample;

import android.util.Log;

/**
 * Created by hoanglinhtan on 08/11/2017.
 */

public class NetworkChannel {
    private String a = "1";
    public NetworkChannel() {
        Log.i("tag1","network channel constructor");
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }
}
