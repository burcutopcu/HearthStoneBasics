package com.burcutopcu.hearthstonebasics.mainBottomNavView.fragments.searchFragment;

import com.burcutopcu.hearthstonebasics.api.ApiManager;
import com.burcutopcu.hearthstonebasics.helper.modelParseHelper.SearchAndFilterModelParseHelper;
import com.burcutopcu.hearthstonebasics.network.IHearthStoneRepo;
import com.burcutopcu.hearthstonebasics.network.repo.HearthStoneRepo;
import dagger.Module;
import dagger.Provides;

@Module
public class SearchFragmentModule {

    @Provides
    SearchAndFilterModelParseHelper provideSearchInfoModelParseHelper() {
        return new SearchAndFilterModelParseHelper();
    }

    @Provides
    IHearthStoneRepo provideHearthStoneRepo(ApiManager apiManager) {
        return new HearthStoneRepo(apiManager);
    }



}
