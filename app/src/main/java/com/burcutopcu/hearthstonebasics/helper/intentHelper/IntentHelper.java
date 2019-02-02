package com.burcutopcu.hearthstonebasics.helper.intentHelper;

import android.content.Context;
import android.content.Intent;
import com.burcutopcu.hearthstonebasics.cardDetailActivity.CardDetailActivity;

public class IntentHelper{

    private Context mContext;

    public IntentHelper(Context mContext) {
        this.mContext = mContext;
    }

    public void goDetailActivityFromFragment(String name) {
        Intent intent = new Intent(mContext, CardDetailActivity.class);
        intent.putExtra(IntentKeys.CARD_NAME, name);
        mContext.startActivity(intent);
    }
}
