package com.burcutopcu.hearthstonebasics.mainBottomNavView.fragments.filterFragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ProgressBar;
import android.widget.Spinner;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

import com.burcutopcu.hearthstonebasics.R;
import com.burcutopcu.hearthstonebasics.adapters.FilterCardAdapter;
import com.burcutopcu.hearthstonebasics.adapters.IAdapterItemClickListener;
import com.burcutopcu.hearthstonebasics.app.AppModule;
import com.burcutopcu.hearthstonebasics.helper.imageProcessHelper.PicassoImageHelper;
import com.burcutopcu.hearthstonebasics.helper.intentHelper.IntentModule;
import com.burcutopcu.hearthstonebasics.models.CardModel;

import org.jetbrains.annotations.NotNull;

import static android.R.layout.simple_spinner_dropdown_item;


import javax.inject.Inject;

import java.util.List;

public class FilterFragment extends Fragment implements FilterFragmentContract.View {

    @BindView(R.id.card_classes_spinner)
    Spinner cardClassesSpinner;

    @BindView(R.id.filter_rv)
    RecyclerView filterRv;

    @BindView(R.id.progress)
    ProgressBar mProgress;

    @BindView(R.id.tv_no_result)
    AppCompatTextView noResultTv;


    FilterCardAdapter filterCardAdapter;

    @Inject
    FilterFragmentPresenter mPresenter;

    @Inject
    PicassoImageHelper mImageHelper;


    public static FilterFragment newInstance() {

        Bundle args = new Bundle();

        FilterFragment fragment = new FilterFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_filter, container, false);
        injectDependency();
        ButterKnife.bind(this, view);
        this.mPresenter.setView(this);
        this.mPresenter.onCreateView();
        return view;
    }

    private void injectDependency() {
        DaggerFilterFragmentComponent.builder()
                .appModule(new AppModule(getContext()))
                .intentModule(new IntentModule())
                .filterFragmentModule(new FilterFragmentModule())
                .build().inject(this);
    }

    @Override
    public void showTenCardItem(List<CardModel> classList) {
        this.showFilterList();
        filterCardAdapter = new FilterCardAdapter(getContext(), classList, mImageHelper);
        filterCardAdapter.setClickListener(new IAdapterItemClickListener() {
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
        filterRv.setLayoutManager(mLayoutManager);
        filterRv.setAdapter(filterCardAdapter);
    }

    @Override
    public void showSpinnerItems(List<String> spinnerList) {

        ArrayAdapter adapter = new ArrayAdapter(getActivity(), android.R.layout.simple_spinner_dropdown_item, spinnerList);
        adapter.setDropDownViewResource(simple_spinner_dropdown_item);
        adapter.setNotifyOnChange(true);
        cardClassesSpinner.setAdapter(adapter);
        cardClassesSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String item = parent.getItemAtPosition(position).toString();
                mPresenter.onReceivedFilterClass(item);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
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
    public void hideFilterList() {
        this.filterRv.setVisibility(View.GONE);

    }

    @Override
    public void showFilterList() {
        this.filterRv.setVisibility(View.VISIBLE);
    }
}
