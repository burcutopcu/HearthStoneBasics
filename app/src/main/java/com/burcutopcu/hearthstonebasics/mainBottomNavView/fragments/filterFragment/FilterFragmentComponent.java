package com.burcutopcu.hearthstonebasics.mainBottomNavView.fragments.filterFragment;

import com.burcutopcu.hearthstonebasics.app.AppModule;
import com.burcutopcu.hearthstonebasics.helper.imageProcessHelper.ImageProcessModule;
import com.burcutopcu.hearthstonebasics.helper.intentHelper.IntentModule;
import dagger.Component;

import javax.inject.Singleton;

@Singleton
@Component(modules = {AppModule.class, ImageProcessModule.class,IntentModule.class, FilterFragmentModule.class})
public interface FilterFragmentComponent {

    void inject(FilterFragment fragment);
}
