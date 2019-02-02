package com.burcutopcu.hearthstonebasics.mainBottomNavView.fragments.searchFragment;

import android.text.TextWatcher;
import com.burcutopcu.hearthstonebasics.api.IServiceResponseCallback;
import com.burcutopcu.hearthstonebasics.helper.intentHelper.IntentHelper;
import com.burcutopcu.hearthstonebasics.helper.modelParseHelper.SearchAndFilterModelParseHelper;
import com.burcutopcu.hearthstonebasics.models.CardModel;
import com.burcutopcu.hearthstonebasics.network.IHearthStoneRepo;
import com.burcutopcu.hearthstonebasics.network.repo.HearthStoneRepo;
import org.jetbrains.annotations.Nullable;

import javax.inject.Inject;
import java.util.List;

public class SearchFragmentPresenter implements SearchFragmentContract.Presenter {

    private SearchFragmentContract.View mView;

    @Inject
    SearchFragmentPresenter() {

    }

    @Inject
    IHearthStoneRepo mHearthStoneRepo;

    @Inject
    SearchAndFilterModelParseHelper mInfoModelParseHelper;



    @Inject
    IntentHelper mIntentHelper;


    @Override
    public void setView(SearchFragmentContract.View view) {
        this.mView = view;
    }

    @Override
    public void onCreateView() {
        requestForSearch("Saron");
        this.mView.initializeSearchTextWatcher();
    }

    @Override
    public void onReceivedSearchWord(String searchWord) {
        requestForSearch(searchWord);
    }

    @Override
    public void onReceivedClickedItem(String name) {
        mIntentHelper.goDetailActivityFromFragment(name);
    }

    private void requestForSearch(String name) {
        this.mView.showProgress();
        this.mView.hideNoResultView();
        this.mView.hideFilterList();
        mHearthStoneRepo.getSearchInfo(name, new IServiceResponseCallback<List<CardModel>>() {
            @Override
            public void onServerCompleted() {

            }

            @Override
            public void onServerCompleted(List<CardModel> cardModel) {
                List<CardModel> classList = mInfoModelParseHelper.getFirstTenCard(cardModel);
                if (classList != null){
                    mView.hideProgress();
                    mView.hideNoResultView();
                    mView.showTenCardItem(classList);
                }else{
                    mView.hideProgress();
                    mView.showNoResultView();
                    mView.hideFilterList();
                }
            }

            @Override
            public void onServerError(@Nullable String error) {
                mView.hideProgress();
                mView.showNoResultView();
                mView.hideFilterList();
            }
        });
    }

}
