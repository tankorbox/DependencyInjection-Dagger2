package com.example.hoanglinhtan.dependencyinjectionsample;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by hoanglinhtan on 08/11/2017.
 */

@Component(modules = {AppModule.class, UtilsModule.class, ReceiversModule.class})
@Singleton
public interface AppComponent {
    void inject(MainActivity activity);
}
