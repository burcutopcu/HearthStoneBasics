package com.burcutopcu.hearthstonebasics.cardDetailActivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatImageView;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.CardView;
import android.view.View;

import butterknife.BindView;
import butterknife.ButterKnife;

import com.burcutopcu.hearthstonebasics.R;
import com.burcutopcu.hearthstonebasics.app.AppModule;
import com.burcutopcu.hearthstonebasics.helper.imageProcessHelper.PicassoImageHelper;
import com.burcutopcu.hearthstonebasics.helper.intentHelper.IntentKeys;
import com.squareup.picasso.Picasso;

import javax.inject.Inject;

public class CardDetailActivity extends AppCompatActivity implements CardDetailActivityContract.View {

    @Inject
    CardDetailActivityPresenter mPresenter;

    @BindView(R.id.toolbar_tv)
    AppCompatTextView toolbarTv;

    @BindView(R.id.toolbar_iv)
    AppCompatImageView toolbarIv;

    @BindView(R.id.card_cv)
    CardView cardCv;

    @BindView(R.id.card_iv)
    AppCompatImageView cardIv;

    @BindView(R.id.player_class_value_tv)
    AppCompatTextView playerClassValueTv;

    @BindView(R.id.rarity_value_tv)
    AppCompatTextView rarityValueTv;

    @BindView(R.id.type_value_tv)
    AppCompatTextView typeValueTv;

    @BindView(R.id.cost_value_tv)
    AppCompatTextView costValueTv;

    @BindView(R.id.attack_value_tv)
    AppCompatTextView attackValueTv;

    @BindView(R.id.health_value_tv)
    AppCompatTextView healthValueTv;

    @BindView(R.id.battlecry_value_tv)
    AppCompatTextView battlecryValueTv;

    @BindView(R.id.flavor_value_tv)
    AppCompatTextView flavorValueTv;

    @Inject
    PicassoImageHelper mImageHelper;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_detail);

        DaggerCardDetailActivityComponent.builder()
                .appModule(new AppModule(this))
                .cardDetailActivityModule(new CardDetailActivityModule())
                .build().inject(this);

        ButterKnife.bind(this);
        mPresenter.setView(this);
        mPresenter.onCreate(getIntent());

        toolbarIv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }

    @Override
    public void setCardName(String name) {
        toolbarTv.setText(name);
    }

    @Override
    public void setCardImage(String imagePath) {
        mImageHelper.setImageWithPath(imagePath, cardIv);
    }

    @Override
    public void setCarPlayerClass(String playerClass) {
        playerClassValueTv.setText(playerClass);
    }

    @Override
    public void setCardRarity(String rarity) {
        rarityValueTv.setText(rarity);
    }

    @Override
    public void setType(String type) {
        typeValueTv.setText(type);
    }

    @Override
    public void setCost(String cost) {
        costValueTv.setText(cost);
    }

    @Override
    public void setAttack(String attack) {
        attackValueTv.setText(attack);
    }

    @Override
    public void setHealth(String health) {
        healthValueTv.setText(health);
    }

    @Override
    public void setCardText(String spanned) {
        battlecryValueTv.setText(spanned);
    }

    @Override
    public void setFlavor(String flavor) {
        flavorValueTv.setText(flavor);
    }

}
