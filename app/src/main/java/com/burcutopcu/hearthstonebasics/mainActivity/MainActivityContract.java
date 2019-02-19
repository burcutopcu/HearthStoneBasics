package com.burcutopcu.hearthstonebasics.mainActivity;

import android.content.Intent;

public interface MainActivityContract {

    interface View{

        void initBottomNavView();
        void showGeneralClasses(String stClass);
        }

    interface Presenter {

        void setView(MainActivityContract.View view);
        void onCreate();
    }
}
