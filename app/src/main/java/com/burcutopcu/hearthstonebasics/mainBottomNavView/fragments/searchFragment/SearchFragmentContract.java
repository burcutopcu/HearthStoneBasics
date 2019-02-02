package com.burcutopcu.hearthstonebasics.mainBottomNavView.fragments.searchFragment;

import android.text.TextWatcher;
import com.burcutopcu.hearthstonebasics.models.CardModel;

import java.util.List;

public interface SearchFragmentContract {

    interface View {

       void showTenCardItem(List<CardModel> classList);

        void initializeSearchTextWatcher();

        void hideProgress();

        void showProgress();

        void hideNoResultView();

        void showNoResultView();

        void hideFilterList();

        void showFilterList();
    }

    interface Presenter{

        void setView (SearchFragmentContract.View view);

        void onCreateView();

        void onReceivedSearchWord(String searchWord);

        void onReceivedClickedItem(String name);

    }
}
