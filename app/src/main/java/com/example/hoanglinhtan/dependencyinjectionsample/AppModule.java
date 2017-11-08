package com.example.hoanglinhtan.dependencyinjectionsample;

import android.content.Context;
import android.support.annotation.NonNull;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by hoanglinhtan on 08/11/2017.
 */

@Module
public class AppModule {
    private Context appContext;
    public AppModule(@NonNull Context context) {
        appContext = context;
    }

    @Provides
    @Singleton
    Context provideContext() {
        return appContext;
    }

}
