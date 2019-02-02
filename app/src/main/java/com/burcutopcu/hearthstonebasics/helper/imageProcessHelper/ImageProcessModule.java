package com.burcutopcu.hearthstonebasics.helper.imageProcessHelper;

import dagger.Module;
import dagger.Provides;

@Module
public class ImageProcessModule {

    @Provides
    ImagePathConverter provideImagePathConverter() {
        return new ImagePathConverter();
    }

    @Provides
    PicassoImageHelper providePicassoImageHelper(ImagePathConverter converter) {
        return new PicassoImageHelper(converter);
    }
}
