package com.burcutopcu.hearthstonebasics.helper.intentHelper;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.burcutopcu.hearthstonebasics.cardDetailActivity.CardDetailActivity;
import com.burcutopcu.hearthstonebasics.mainActivity.MainActivity;
import com.burcutopcu.hearthstonebasics.models.CardModel;

import java.util.ArrayList;

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

    public Intent getMainActivityIntent(){
        Intent intent= new Intent(mContext, MainActivity.class);
        return intent;
    }
}
