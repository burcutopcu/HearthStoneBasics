package com.burcutopcu.hearthstonebasics.mainBottomNavView.fragments.filterFragment;

import android.app.Activity;
import android.widget.Spinner;

import com.burcutopcu.hearthstonebasics.models.CardModel;
import com.burcutopcu.hearthstonebasics.models.GeneralInfoModel;

import java.util.List;

public interface FilterFragmentContract {

    interface View {

        void showTenCardItem(List<CardModel> classList);

        void showSpinnerItems(List<String> spinnerList);

        void hideProgress();

        void showProgress();

        void hideNoResultView();

        void showNoResultView();

        void hideFilterList();

        void showFilterList();

    }

    interface Presenter {
        void setView(FilterFragmentContract.View view);

        void onCreateView();

        void onReceivedFilterClass(String name);

        void onReceivedClickedItem(String name);
    }
}
