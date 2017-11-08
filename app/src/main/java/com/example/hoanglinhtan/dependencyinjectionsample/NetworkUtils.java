package com.example.hoanglinhtan.dependencyinjectionsample;

import android.content.Context;
import android.util.Log;


/**
 * Created by hoanglinhtan on 08/11/2017.
 */

public class NetworkUtils {
    Context context;
    NetworkChannel networkChannel;

    public NetworkUtils(Context context, NetworkChannel networkChannel) {
        Log.i("tag1",NetworkUtils.class.getName()+" constructor");
        this.context = context;
        this.networkChannel = networkChannel;
    }

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public NetworkChannel getNetworkChannel() {
        return networkChannel;
    }

    public void setNetworkChannel(NetworkChannel networkChannel) {
        this.networkChannel = networkChannel;
    }
}
