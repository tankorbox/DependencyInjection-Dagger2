package com.example.hoanglinhtan.dependencyinjectionsample;

import android.support.annotation.NonNull;
import android.util.Log;


import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by hoanglinhtan on 08/11/2017.
 */

@Module
public class ReceiversModule {
    @Provides
    @NonNull
    @Singleton
    public NetworkChannel provideNetworkChannel() {
        Log.i("tag1","receivers module method");
        return new NetworkChannel();
    }
}
