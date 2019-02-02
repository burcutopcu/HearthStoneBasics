package com.burcutopcu.hearthstonebasics.mainActivity;

import com.burcutopcu.hearthstonebasics.app.AppModule;
import com.burcutopcu.hearthstonebasics.mainBottomNavView.module.MainBottomNavigationModule;
import dagger.Component;

import javax.inject.Singleton;

@Singleton
@Component(modules = {AppModule.class,MainActivityModule.class, MainBottomNavigationModule.class})
public interface MainActivityComponent {

    void inject(MainActivity activity);
}
