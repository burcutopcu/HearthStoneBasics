package com.burcutopcu.hearthstonebasics.mainBottomNavView.fragments.filterFragment;

import com.burcutopcu.hearthstonebasics.api.IServiceResponseCallback;
import com.burcutopcu.hearthstonebasics.helper.intentHelper.IntentHelper;
import com.burcutopcu.hearthstonebasics.helper.modelParseHelper.GeneralInfoModelParseHelper;
import com.burcutopcu.hearthstonebasics.helper.modelParseHelper.SearchAndFilterModelParseHelper;
import com.burcutopcu.hearthstonebasics.models.CardModel;
import com.burcutopcu.hearthstonebasics.models.GeneralInfoModel;
import com.burcutopcu.hearthstonebasics.network.IHearthStoneRepo;
import com.burcutopcu.hearthstonebasics.network.repo.HearthStoneRepo;

import org.jetbrains.annotations.Nullable;

import javax.inject.Inject;

import java.util.List;


public class FilterFragmentPresenter implements FilterFragmentContract.Presenter {

    private FilterFragmentContract.View mView;

    @Inject
    FilterFragmentPresenter() {

    }

    @Inject
    IHearthStoneRepo mHearthStoneRepo;

    @Inject
    GeneralInfoModelParseHelper mInfoModelParseHelper;

    @Inject
    SearchAndFilterModelParseHelper mFilteredInfoModelParseHelper;

    @Inject
    IntentHelper mIntentHelper;

    @Override
    public void setView(FilterFragmentContract.View view) {

        this.mView = view;
    }

    @Override
    public void onCreateView() {
        this.mView.showProgress();
        mHearthStoneRepo.getGeneralInfo(new IServiceResponseCallback<GeneralInfoModel>() {
            @Override
            public void onServerCompleted() {

            }

            @Override
            public void onServerCompleted(GeneralInfoModel generalInfoModel) {
                List<String> classList = mInfoModelParseHelper.getHeroClassList(generalInfoModel);
                if (classList != null) {
                    mView.showSpinnerItems(classList);
                }

            }

            @Override
            public void onServerError(@Nullable String error) {
                mView.hideProgress();
                mView.hideFilterList();
                mView.showNoResultView();
            }
        });
    }

    @Override
    public void onReceivedFilterClass(String name) {
        requestForFilter(name);
    }

    @Override
    public void onReceivedClickedItem(String name) {
        mIntentHelper.goDetailActivityFromFragment(name);
    }

    private void requestForFilter(String name) {
        this.mView.hideFilterList();
        this.mView.hideNoResultView();
        this.mView.showProgress();
        mHearthStoneRepo.getFilteredClassInfo(name, new IServiceResponseCallback<List<CardModel>>() {

            @Override
            public void onServerCompleted() {

            }

            @Override
            public void onServerCompleted(List<CardModel> cardModelList) {
                List<CardModel> filterCardModelList = mFilteredInfoModelParseHelper.getFirstTenCard(cardModelList);
                if (filterCardModelList != null){
                    mView.hideProgress();
                    mView.showTenCardItem(filterCardModelList);
                }else{
                    mView.hideProgress();
                    mView.hideFilterList();
                    mView.showNoResultView();
                }

            }

            @Override
            public void onServerError(@Nullable String error) {
                mView.hideProgress();
                mView.hideFilterList();
                mView.showNoResultView();
            }
        });
    }
}
