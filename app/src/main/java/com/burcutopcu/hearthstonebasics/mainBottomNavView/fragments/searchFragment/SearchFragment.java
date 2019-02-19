package com.burcutopcu.hearthstonebasics.mainBottomNavView.fragments.searchFragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.*;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.*;
import android.widget.ProgressBar;

import butterknife.BindView;
import butterknife.ButterKnife;

import com.burcutopcu.hearthstonebasics.R;
import com.burcutopcu.hearthstonebasics.adapters.IAdapterItemClickListener;
import com.burcutopcu.hearthstonebasics.adapters.SearchCardAdapter;
import com.burcutopcu.hearthstonebasics.app.AppModule;
import com.burcutopcu.hearthstonebasics.helper.imageProcessHelper.PicassoImageHelper;
import com.burcutopcu.hearthstonebasics.models.CardModel;

import org.jetbrains.annotations.NotNull;

import javax.inject.Inject;

import java.util.List;

public class SearchFragment extends Fragment implements SearchFragmentContract.View {

    SearchCardAdapter adapter;

    @BindView(R.id.card_item_rv)
    RecyclerView cartItemRv;

    @BindView(R.id.search_et)
    AppCompatEditText searchEt;

    @BindView(R.id.progress)
    ProgressBar mProgress;

    @BindView(R.id.tv_no_result)
    AppCompatTextView noResultTv;

    @Inject
    SearchFragmentPresenter mPresenter;

    @Inject
    PicassoImageHelper mImageHelper;

    public static SearchFragment newInstance() {

        Bundle args = new Bundle();

        SearchFragment fragment = new SearchFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_search, container, false);
        injectDependency();

        ButterKnife.bind(this, view);
        this.mPresenter.setView(this);
        this.mPresenter.onCreateView();

        return view;
    }

    private void injectDependency() {
        DaggerSearchFragmentComponent.builder()
                .appModule(new AppModule(getContext()))
                .searchFragmentModule(new SearchFragmentModule())
                .build().inject(this);
    }

    @Override
    public void showTenCardItem(List<CardModel> classList) {
        this.showFilterList();
        adapter = new SearchCardAdapter(getContext(), classList, mImageHelper);

        adapter.setClickListener(new IAdapterItemClickListener() {
            @Override
            public void onItemClick(int position) {
                //Silence is golden
            }

            @Override
            public void onItemClick(@NotNull String name) {

                mPresenter.onReceivedClickedItem(name);
            }
        });

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getContext());

        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(getContext(),DividerItemDecoration.VERTICAL);
        cartItemRv.addItemDecoration(dividerItemDecoration);

        cartItemRv.setLayoutManager(mLayoutManager);
        cartItemRv.setAdapter(adapter);
    }

    @Override
    public void initializeSearchTextWatcher() {
        this.searchEt.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                //Silence is golden
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                //Silence is golden
            }

            @Override
            public void afterTextChanged(Editable s) {
                if (s != null && s.toString().trim().length() >= 3) {
                    mPresenter.onReceivedSearchWord(s.toString().trim());
                }
            }
        });
    }

    @Override
    public void hideProgress() {
        this.mProgress.setVisibility(View.GONE);
    }

    @Override
    public void showProgress() {
        this.mProgress.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideNoResultView() {
        this.noResultTv.setVisibility(View.GONE);
    }

    @Override
    public void showNoResultView() {
        this.noResultTv.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideFilterList() { this.cartItemRv.setVisibility(View.GONE); }

    @Override
    public void showFilterList() {
        this.cartItemRv.setVisibility(View.VISIBLE);
    }
}

