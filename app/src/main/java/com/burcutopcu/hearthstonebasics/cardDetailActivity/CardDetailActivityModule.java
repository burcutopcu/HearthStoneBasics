package com.burcutopcu.hearthstonebasics.cardDetailActivity;


import com.burcutopcu.hearthstonebasics.api.ApiManager;
import com.burcutopcu.hearthstonebasics.network.IHearthStoneRepo;
import com.burcutopcu.hearthstonebasics.network.repo.HearthStoneRepo;
import dagger.Module;
import dagger.Provides;

@Module
public class CardDetailActivityModule {

    @Provides
    IHearthStoneRepo provideHearthStoneRepo(ApiManager apiManager) {

        return new HearthStoneRepo(apiManager);
    }
}
