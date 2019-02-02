package com.burcutopcu.hearthstonebasics.mainActivity;

import com.burcutopcu.hearthstonebasics.api.ApiManager;
import com.burcutopcu.hearthstonebasics.helper.modelParseHelper.GeneralInfoModelParseHelper;
import com.burcutopcu.hearthstonebasics.network.repo.HearthStoneRepo;
import dagger.Module;
import dagger.Provides;

@Module
public class MainActivityModule {

    @Provides
    GeneralInfoModelParseHelper provideGeneralInfoModelParseHelper() {
        return new GeneralInfoModelParseHelper();
    }

    @Provides
    HearthStoneRepo provideHearthStoneRepo(ApiManager apiManager) {
        return new HearthStoneRepo(apiManager);
    }
}
