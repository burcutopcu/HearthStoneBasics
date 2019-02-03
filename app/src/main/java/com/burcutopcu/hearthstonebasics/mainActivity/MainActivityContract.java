package com.burcutopcu.hearthstonebasics.mainActivity;

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
