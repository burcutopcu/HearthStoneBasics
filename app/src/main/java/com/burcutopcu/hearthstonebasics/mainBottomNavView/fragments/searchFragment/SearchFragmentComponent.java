package com.burcutopcu.hearthstonebasics.mainBottomNavView.fragments.searchFragment;

import com.burcutopcu.hearthstonebasics.app.AppModule;
import com.burcutopcu.hearthstonebasics.helper.imageProcessHelper.ImageProcessModule;
import com.burcutopcu.hearthstonebasics.helper.intentHelper.IntentModule;
import dagger.Component;

import javax.inject.Singleton;

@Singleton
@Component(modules = {AppModule.class, IntentModule.class, ImageProcessModule.class,SearchFragmentModule.class})
public interface SearchFragmentComponent {

    void inject(SearchFragment fragment);
}
