package com.burcutopcu.hearthstonebasics.mainBottomNavView;

import com.burcutopcu.hearthstonebasics.mainBottomNavView.constants.BottomNavigationViewType;
import com.burcutopcu.hearthstonebasics.mainBottomNavView.fragments.MainBottomViewFragmentManager;
import com.burcutopcu.hearthstonebasics.mainBottomNavView.interfaces.IBottomNavigationViewClickListener;

public class MainBottomNavigationViewManager implements IBottomNavigationViewClickListener {

    private MainBottomNavigationView mBottomNavigationView;
    private int currentBottomNavigationViewType;
    private MainBottomViewFragmentManager mManager;

    public MainBottomNavigationViewManager(MainBottomViewFragmentManager manager) {
        this.mManager=manager;
    }

    public void initializeBottomNavView(MainBottomNavigationView bottomNavigationView) {
        this.mBottomNavigationView=bottomNavigationView;
        this.mBottomNavigationView.initClickListener(this);
        this.mBottomNavigationView.initializeSearchTab();
        this.mManager.initializeSearchFragment();
        currentBottomNavigationViewType=BottomNavigationViewType.SEARCH;

    }

    @Override
    public void onBottomViewClickListener(Integer viewType) {
        switch (viewType){
            case BottomNavigationViewType.SEARCH:
                if (currentBottomNavigationViewType != BottomNavigationViewType.SEARCH) {

                    mBottomNavigationView.initializeSearchTab();

                    mManager.initializeSearchFragment();
                    currentBottomNavigationViewType = BottomNavigationViewType.SEARCH;

                }
                break;

            case BottomNavigationViewType.FILTER:
                if (currentBottomNavigationViewType != BottomNavigationViewType.FILTER){
                    mBottomNavigationView.initializeFilterTab();

                    mManager.initializeFilterFragment();
                    currentBottomNavigationViewType = BottomNavigationViewType.FILTER;
                }
                break;
        }
    }
}
