package com.burcutopcu.hearthstonebasics.helper.intentHelper;

import android.content.Context;
import dagger.Module;
import dagger.Provides;

@Module
public class IntentModule {

    @Provides
    IntentHelper provideIntentHelper(Context context) {
        return new IntentHelper(context);
    }
}
