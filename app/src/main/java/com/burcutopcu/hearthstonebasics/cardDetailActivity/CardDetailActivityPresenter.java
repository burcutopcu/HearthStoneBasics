package com.burcutopcu.hearthstonebasics.cardDetailActivity;


import android.content.Intent;
import android.text.Html;
import com.burcutopcu.hearthstonebasics.api.IServiceResponseCallback;
import com.burcutopcu.hearthstonebasics.helper.intentHelper.IntentKeys;
import com.burcutopcu.hearthstonebasics.models.CardModel;
import com.burcutopcu.hearthstonebasics.network.IHearthStoneRepo;
import org.jetbrains.annotations.Nullable;

import javax.inject.Inject;
import java.util.List;

public class CardDetailActivityPresenter implements CardDetailActivityContract.Presenter {

    CardDetailActivityContract.View mView;


    @Inject
    CardDetailActivityPresenter() {

    }

    @Inject
    IHearthStoneRepo mHeartStoneRepo;


    @Override
    public void setView(CardDetailActivityContract.View view) {
        this.mView = view;
    }

    @Override
    public void onCreate(Intent intent) {
        if (intent.hasExtra(IntentKeys.CARD_NAME)) {
            String key = intent.getStringExtra(IntentKeys.CARD_NAME);
            requestForCard(key);
        }
    }

    @Override
    public void requestForCard(String name) {
        mHeartStoneRepo.getCardInfoDetail(name, new IServiceResponseCallback<List<CardModel>>() {
            @Override
            public void onServerCompleted() {

            }

            @Override
            public void onServerCompleted(List<CardModel> cardModelList) {

                if (!cardModelList.isEmpty() && cardModelList.get(0) != null) {

                    CardModel cardModel = cardModelList.get(0);

                    if (cardModel.getName() != null)
                        mView.setCardName(cardModel.getName());
                    else
                        mView.setCardName("--");

                    if (cardModel.getImg() != null)
                        mView.setCardImage(cardModel.getImg());

                    if (cardModel.getPlayerClass() != null)
                        mView.setCarPlayerClass(cardModel.getPlayerClass());
                    else
                        mView.setCarPlayerClass("--");

                    if (cardModel.getRarity() != null)
                        mView.setCardRarity(cardModel.getRarity());
                    else
                        mView.setCardRarity("--");

                    if (cardModel.getType() != null)
                        mView.setType(cardModel.getType());
                    else
                        mView.setType("--");

                    if (cardModel.getCost() != null)
                        mView.setCost(String.valueOf(cardModel.getCost()));
                    else
                        mView.setCost("--");

                    if (cardModel.getAttack() != null)
                        mView.setAttack(String.valueOf(cardModel.getAttack()));
                    else
                        mView.setAttack("--");

                    if (cardModel.getHealth() != null)
                        mView.setHealth(String.valueOf(cardModel.getHealth()));
                    else
                        mView.setHealth("--");

                    if (cardModel.getText() != null)
                        mView.setCardText(Html.fromHtml(cardModel.getText()).toString());
                    else
                        mView.setCardText("--");

                    if (cardModel.getFlavor() != null)
                        mView.setFlavor(Html.fromHtml(cardModel.getFlavor()).toString());
                    else
                        mView.setFlavor("--");

                }

            }


            @Override
            public void onServerError(@Nullable String error) {

            }
        });
    }
}
