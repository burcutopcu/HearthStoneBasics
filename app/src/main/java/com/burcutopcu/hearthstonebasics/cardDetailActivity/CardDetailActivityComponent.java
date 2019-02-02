package com.burcutopcu.hearthstonebasics.cardDetailActivity;


import com.burcutopcu.hearthstonebasics.app.AppModule;
import com.burcutopcu.hearthstonebasics.helper.imageProcessHelper.ImageProcessModule;

import dagger.Component;

import javax.inject.Singleton;

@Singleton
@Component(modules = {AppModule.class, ImageProcessModule.class, CardDetailActivityModule.class})
public interface CardDetailActivityComponent {

    void inject(CardDetailActivity cardDetailActivity);
}
