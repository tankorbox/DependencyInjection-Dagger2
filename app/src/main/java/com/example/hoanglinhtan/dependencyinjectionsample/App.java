package com.example.hoanglinhtan.dependencyinjectionsample;

import android.app.Application;
import android.util.Log;

/**
 * Created by hoanglinhtan on 08/11/2017.
 */

public class App extends Application {
    private static AppComponent component;

    public static AppComponent getComponent() {
        if (component == null) Log.i("tag1","app null getcomponent");
        return component;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        component = buildComponent();
        Log.i("tag1", component==null? "app null":"app not null");
    }

    protected AppComponent buildComponent() {
        return DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .utilsModule(new UtilsModule())
                .receiversModule(new ReceiversModule())
                .build();
    }

}
