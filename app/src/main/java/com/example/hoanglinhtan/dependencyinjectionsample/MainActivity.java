package com.example.hoanglinhtan.dependencyinjectionsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;


import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    RxUtilAbs rxUtilAbs;
    @Inject
    NetworkUtils networkUtils;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("tag1",MainActivity.class.getName() +" oncreate()");
        App.getComponent().inject(this);
        if (rxUtilAbs==null) Log.i("tag1","null");
    }

}
