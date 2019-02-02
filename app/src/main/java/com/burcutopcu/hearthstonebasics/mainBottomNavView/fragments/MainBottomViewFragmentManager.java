package com.burcutopcu.hearthstonebasics.mainBottomNavView.fragments;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import com.burcutopcu.hearthstonebasics.R;
import com.burcutopcu.hearthstonebasics.mainBottomNavView.constants.MainBottomNavFragmentConstant;
import com.burcutopcu.hearthstonebasics.mainBottomNavView.fragments.filterFragment.FilterFragment;
import com.burcutopcu.hearthstonebasics.mainBottomNavView.fragments.searchFragment.SearchFragment;

public class MainBottomViewFragmentManager {

    FragmentActivity mActivity;
    Fragment mActiveFragment;

    public MainBottomViewFragmentManager(FragmentActivity fragmentActivity) {
        this.mActivity=fragmentActivity;
    }

    private FragmentManager getFragmentManager() {
        return mActivity.getSupportFragmentManager();
    }

    private FragmentTransaction getFragmentTransaction(){
        return getFragmentManager().beginTransaction();
    }

    public void initializeSearchFragment() {
        initializeGenericFragment(SearchFragment.newInstance(), MainBottomNavFragmentConstant.FRAGMENT_SEARCH);
    }

    public void initializeFilterFragment() {
        initializeGenericFragment(FilterFragment.newInstance(), MainBottomNavFragmentConstant.FRAGMENT_FILTER);
    }

    private void initializeGenericFragment(Fragment newFragment, String tag){
        Fragment currentFragment= getFragmentManager().findFragmentByTag(tag);

        if (mActiveFragment != null) {
            getFragmentTransaction().hide(mActiveFragment).commit();
        }

        if (currentFragment != null){
            mActiveFragment=currentFragment;
            getFragmentTransaction().show(mActiveFragment).commit();
        } else {
            mActiveFragment= addFragment(newFragment, tag);
        }
    }

    private Fragment addFragment(Fragment newFragment, String tag) {
       getFragmentTransaction().add(R.id.fragment_container,newFragment,tag).commit();
       return newFragment;
    }

}
