package com.burcutopcu.hearthstonebasics.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.AppCompatImageView;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.burcutopcu.hearthstonebasics.R;
import com.burcutopcu.hearthstonebasics.helper.imageProcessHelper.PicassoImageHelper;
import com.burcutopcu.hearthstonebasics.helper.intentHelper.IntentHelper;

import com.burcutopcu.hearthstonebasics.mainBottomNavView.fragments.searchFragment.SearchFragmentContract;
import com.burcutopcu.hearthstonebasics.models.CardModel;
import com.squareup.picasso.Picasso;

import javax.inject.Inject;

import java.util.List;

public class SearchCardAdapter extends RecyclerView.Adapter<SearchCardAdapter.SearchCardViewHolder> {

    private IAdapterItemClickListener mClickListener;
    private Context mContext;
    private List<CardModel> searchCardModelArrayList;
    private PicassoImageHelper mImageHelper;

    @Inject
    IntentHelper mIntentHelper;

    public SearchCardAdapter(Context mContext,
                             List<CardModel> searchCardModelArrayList,
                             PicassoImageHelper picassoImageHelper) {
        this.mContext = mContext;
        this.searchCardModelArrayList = searchCardModelArrayList;
        this.mImageHelper = picassoImageHelper;

    }

    public void setClickListener(IAdapterItemClickListener clickListener) {
        this.mClickListener = clickListener;
    }


    @NonNull
    @Override
    public SearchCardViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(mContext).inflate(R.layout.item_card, viewGroup, false);
        return new SearchCardViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull final SearchCardViewHolder searchCardViewHolder, int position) {

        final CardModel currentModel = searchCardModelArrayList.get(position);
        String imagePath = currentModel.getImg();
        String name = currentModel.getName();
        String text = currentModel.getText();

        if (name != null && !name.trim().isEmpty()) {
            searchCardViewHolder.searchCardNameTv.setText(Html.fromHtml(name));
        } else
            searchCardViewHolder.searchCardNameTv.setText("--");


        if (text != null && !text.trim().isEmpty()) {
            searchCardViewHolder.searchCardDescTv.setText(Html.fromHtml(text));
        } else
            searchCardViewHolder.searchCardDescTv.setText("--");

        mImageHelper.setImageWithPath(imagePath, searchCardViewHolder.searchCardIv);


        searchCardViewHolder.itemView.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mClickListener.onItemClick(currentModel.getName());
                    }
                }
        );

    }

    @Override
    public int getItemCount() {
        return searchCardModelArrayList.size();
    }

    public class SearchCardViewHolder extends RecyclerView.ViewHolder {

        AppCompatTextView searchCardNameTv, searchCardDescTv;
        AppCompatImageView searchCardIv;

        public SearchCardViewHolder(@NonNull View itemView) {
            super(itemView);

            searchCardIv = itemView.findViewById(R.id.card_item_iv);
            searchCardNameTv = itemView.findViewById(R.id.card_item_name_tv);
            searchCardDescTv = itemView.findViewById(R.id.card_item_desc_tv);

        }
    }
}
