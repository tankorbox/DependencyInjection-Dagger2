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
public class UtilsModule {
    @Provides
    @NonNull
    @Singleton
    public RxUtilAbs provideRxUtils(Context context) {
        return new RxUtils(context);
    }

    @Provides
    @NonNull
    @Singleton
    public NetworkUtils provideNetworkChannel(Context context, NetworkChannel networkChannel) {
        return new NetworkUtils(context,networkChannel);
    }
}
