package com.burcutopcu.hearthstonebasics.mainBottomNavView;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.burcutopcu.hearthstonebasics.R;
import com.burcutopcu.hearthstonebasics.mainBottomNavView.constants.BottomNavigationViewType;
import com.burcutopcu.hearthstonebasics.mainBottomNavView.interfaces.IBottomNavigationViewClickListener;

public class MainBottomNavigationView extends LinearLayout {

    private Context mContext;
    private IBottomNavigationViewClickListener mClickListener;

    @BindView(R.id.search_tab_ll)
    LinearLayout layoutSearch;

    @BindView(R.id.filter_tab_ll)
    LinearLayout layoutFilter;

    @BindView(R.id.search_tab_tv)
    AppCompatTextView tvSearch;

    @BindView(R.id.filter_tab_tv)
    AppCompatTextView tvFilter;

    public MainBottomNavigationView(Context context) {
        this(context, null);
    }

    public MainBottomNavigationView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public MainBottomNavigationView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.mContext = context;
        initView();
    }

    @OnClick(R.id.search_tab_ll)
    public void onSearchTabClick() {
        if (mClickListener != null)
            mClickListener.onBottomViewClickListener(BottomNavigationViewType.SEARCH);
    }

    @OnClick(R.id.filter_tab_ll)
    void onFilterTabClick() {
        if (mClickListener != null)
            mClickListener.onBottomViewClickListener(BottomNavigationViewType.FILTER);
    }

    private void initView() {
        View rootView = LayoutInflater.from(mContext).inflate(R.layout.custom_bottom_navigation_view, this, true);
        ButterKnife.bind(this, rootView);
    }

    public void initClickListener(IBottomNavigationViewClickListener iBottomNavigationViewClickListener) {
        this.mClickListener=iBottomNavigationViewClickListener;
    }

    public void initializeSearchTab(){
        activateSearch();
        deActivateFilter();
    }

    public void initializeFilterTab(){
        activateFilter();
        deActivateSearch();
    }

    public void activateSearch() {
        this.layoutSearch.setBackgroundColor(ContextCompat.getColor(mContext, R.color.bottom_nav_item_active_background_color));
        this.tvSearch.setTextColor(ContextCompat.getColor(mContext,R.color.bottom_nav_item_active_text_color));
    }

    public void deActivateSearch() {
        this.layoutSearch.setBackgroundColor(ContextCompat.getColor(mContext, R.color.bottom_nav_item_passive_background_color));
        this.tvSearch.setTextColor(ContextCompat.getColor(mContext,R.color.bottom_nav_item_passive_text_color));
    }

    public void activateFilter() {
        this.layoutFilter.setBackgroundColor(ContextCompat.getColor(mContext, R.color.bottom_nav_item_active_background_color));
        this.tvFilter.setTextColor(ContextCompat.getColor(mContext,R.color.bottom_nav_item_active_text_color));
    }

    public void deActivateFilter() {
        this.layoutFilter.setBackgroundColor(ContextCompat.getColor(mContext, R.color.bottom_nav_item_passive_background_color));
        this.tvFilter.setTextColor(ContextCompat.getColor(mContext,R.color.bottom_nav_item_passive_text_color));
    }
}
