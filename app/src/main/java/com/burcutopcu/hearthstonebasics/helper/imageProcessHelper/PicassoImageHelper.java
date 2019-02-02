package com.burcutopcu.hearthstonebasics.helper.imageProcessHelper;

import android.support.v7.widget.AppCompatImageView;

import com.burcutopcu.hearthstonebasics.R;
import com.squareup.picasso.Picasso;

public class PicassoImageHelper {

    private ImagePathConverter mConverter;

    public PicassoImageHelper(ImagePathConverter converter) {
        this.mConverter = converter;
    }

    public void setImageWithPath(String path, AppCompatImageView imageView) {
        Integer placeHolder = R.drawable.hearthstoneplaceholder;

        Picasso.get().load(mConverter.convertHttpToHttps(path))
                .placeholder(placeHolder)
                .error(placeHolder)
                .into(imageView);
    }


}
