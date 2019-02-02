package com.burcutopcu.hearthstonebasics.cardDetailActivity;

import android.content.Intent;

public interface CardDetailActivityContract {

    interface View {

        void setCardName(String name);

        void setCardImage(String ımg);

        void setCarPlayerClass(String playerClass);

        void setCardRarity(String rarity);

        void setType(String type);

        void setCost(String cost);

        void setAttack(String attack);

        void setHealth(String health);

        void setCardText(String spanned);

        void setFlavor(String flavor);
    }

    interface Presenter {

        void setView(CardDetailActivityContract.View view);

        void onCreate(Intent intent);

        void requestForCard(String name);
    }

}
