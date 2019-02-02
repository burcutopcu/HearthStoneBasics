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
import com.burcutopcu.hearthstonebasics.models.CardModel;

import java.util.List;

public class FilterCardAdapter extends RecyclerView.Adapter<FilterCardAdapter.FilterCardViewHolder> {

    private IAdapterItemClickListener mClickListener;
    private Context mContext;
    private List<CardModel> filterCardModelArrayList;
    private PicassoImageHelper mImageHelper;

    public FilterCardAdapter(Context mContext,
                             List<CardModel> cardModelArrayList,
                             PicassoImageHelper picassoImageHelper) {
        this.mContext = mContext;
        this.filterCardModelArrayList = cardModelArrayList;
        this.mImageHelper = picassoImageHelper;
    }

    public void setClickListener(IAdapterItemClickListener clickListener) {
        this.mClickListener = clickListener;
    }

    @NonNull
    @Override
    public FilterCardAdapter.FilterCardViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(mContext).inflate(R.layout.item_card, viewGroup, false);
        return new FilterCardViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull FilterCardAdapter.FilterCardViewHolder filterCardViewHolder, int position) {

        final CardModel currentModel = filterCardModelArrayList.get(position);
        String imagePath = currentModel.getImg();
        String name = currentModel.getName();
        String text = currentModel.getText();
        if (name != null && !name.trim().isEmpty()) {
            filterCardViewHolder.filterCardNameTv.setText(Html.fromHtml(name));
        } else
            filterCardViewHolder.filterCardNameTv.setText("--");


        if (text != null && !text.trim().isEmpty()) {
            filterCardViewHolder.filterCardDescTv.setText(Html.fromHtml(text));
        } else
            filterCardViewHolder.filterCardDescTv.setText("--");

        mImageHelper.setImageWithPath(imagePath, filterCardViewHolder.filterCardIv);

        filterCardViewHolder.itemView.setOnClickListener(
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
        return filterCardModelArrayList.size();
    }

    public class FilterCardViewHolder extends RecyclerView.ViewHolder {

        AppCompatTextView filterCardNameTv, filterCardDescTv;
        AppCompatImageView filterCardIv;

        public FilterCardViewHolder(@NonNull View itemView) {
            super(itemView);

            filterCardNameTv = itemView.findViewById(R.id.card_item_name_tv);
            filterCardDescTv = itemView.findViewById(R.id.card_item_desc_tv);
            filterCardIv = itemView.findViewById(R.id.card_item_iv);

        }
    }
}
