package com.burcutopcu.hearthstonebasics.mainBottomNavView.module;

import android.content.Context;
import android.support.v4.app.FragmentActivity;
import com.burcutopcu.hearthstonebasics.mainBottomNavView.MainBottomNavigationViewManager;
import com.burcutopcu.hearthstonebasics.mainBottomNavView.fragments.MainBottomViewFragmentManager;
import dagger.Module;
import dagger.Provides;

@Module
public class MainBottomNavigationModule {

    private FragmentActivity mActivity;

    public MainBottomNavigationModule(FragmentActivity activity) {
        this.mActivity=activity;
    }

    @Provides
    MainBottomViewFragmentManager provideMainBottomFragmentManager() {
        return new MainBottomViewFragmentManager(mActivity);
    }

    @Provides
    MainBottomNavigationViewManager provideMainBottomNavigationViewManager(MainBottomViewFragmentManager manager){
        return new MainBottomNavigationViewManager(manager);
    }



}
