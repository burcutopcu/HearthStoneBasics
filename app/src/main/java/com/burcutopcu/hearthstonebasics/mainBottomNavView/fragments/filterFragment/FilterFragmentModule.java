package com.burcutopcu.hearthstonebasics.mainBottomNavView.fragments.filterFragment;

import android.content.Context;
import com.burcutopcu.hearthstonebasics.api.ApiManager;
import com.burcutopcu.hearthstonebasics.helper.modelParseHelper.GeneralInfoModelParseHelper;
import com.burcutopcu.hearthstonebasics.helper.modelParseHelper.SearchAndFilterModelParseHelper;
import com.burcutopcu.hearthstonebasics.helper.preferencesHelper.DefaultSharedPreferences;
import com.burcutopcu.hearthstonebasics.helper.preferencesHelper.ISharedPreferencesManagement;
import com.burcutopcu.hearthstonebasics.network.IHearthStoneRepo;
import com.burcutopcu.hearthstonebasics.network.repo.HearthStoneRepo;
import dagger.Module;
import dagger.Provides;

@Module
public class FilterFragmentModule {

    @Provides
    GeneralInfoModelParseHelper provideGeneralInfoModelParseHelper() {
        return new GeneralInfoModelParseHelper();
    }

    @Provides
    SearchAndFilterModelParseHelper proivdeSearchAndFilterModelParseHelper(){ return new SearchAndFilterModelParseHelper(); }

    @Provides
    IHearthStoneRepo provideHearthStoneRepo(ApiManager apiManager) {
        return new HearthStoneRepo(apiManager);
    }

    @Provides
    ISharedPreferencesManagement provideISharedPreferencesManagement(Context mContext) { return new DefaultSharedPreferences(mContext); }
}
