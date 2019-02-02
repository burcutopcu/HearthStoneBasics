package com.burcutopcu.hearthstonebasics.mainActivity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.burcutopcu.hearthstonebasics.R;
import com.burcutopcu.hearthstonebasics.app.AppModule;
import com.burcutopcu.hearthstonebasics.mainBottomNavView.MainBottomNavigationView;
import com.burcutopcu.hearthstonebasics.mainBottomNavView.MainBottomNavigationViewManager;
import com.burcutopcu.hearthstonebasics.mainBottomNavView.module.MainBottomNavigationModule;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity implements MainActivityContract.View {

    @BindView(R.id.bottom_navigation)
    MainBottomNavigationView bottomNavigationView;

    @Inject
    MainBottomNavigationViewManager mBottomNavigationViewManager;

    @Inject
    MainActivityPresenter mainActivityPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DaggerMainActivityComponent.builder()
                .appModule(new AppModule(this))
                .mainBottomNavigationModule(new MainBottomNavigationModule(this))
                .mainActivityModule(new MainActivityModule())
                .build().inject(this);

        ButterKnife.bind(this);
        this.mainActivityPresenter.setView(this);
        this.mainActivityPresenter.onCreate();

    }

    @Override
    public void initBottomNavView() {
        this.mBottomNavigationViewManager.initializeBottomNavView(bottomNavigationView);
    }

    @Override
    public void showGeneralClasses(String stClass) {
        Toast.makeText(this, stClass, Toast.LENGTH_SHORT).show();
    }
}
