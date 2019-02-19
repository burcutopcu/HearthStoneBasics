package com.burcutopcu.hearthstonebasics.mainActivity;

import android.content.Intent;
import com.burcutopcu.hearthstonebasics.helper.intentHelper.IntentKeys;

import javax.inject.Inject;

public class MainActivityPresenter implements MainActivityContract.Presenter {

    private MainActivityContract.View mView;

    @Inject
    MainActivityPresenter() {

    }

    @Override
    public void setView(MainActivityContract.View view) {
        this.mView = view;
    }

    @Override
    public void onCreate() {
        this.mView.initBottomNavView();
    }
}
