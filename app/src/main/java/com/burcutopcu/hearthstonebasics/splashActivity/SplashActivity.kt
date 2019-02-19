package com.burcutopcu.hearthstonebasics.splashActivity

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.WindowManager
import android.widget.Toast
import butterknife.ButterKnife
import com.burcutopcu.hearthstonebasics.R
import com.burcutopcu.hearthstonebasics.app.AppModule
import javax.inject.Inject

class SplashActivity: AppCompatActivity() , SplashActivityContract.View{

    @Inject
    lateinit var mPresenter: SplashActivityPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        DaggerSplashActivityComponent.builder()
            .appModule(AppModule(this))
            .splashActivityModule(SplashActivityModule())
            .build().inject(this)

        ButterKnife.bind(this)
        this.mPresenter.setView(this)
        this.mPresenter.checkNetwork()

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            val w = window // in Activity's onCreate() for instance
            w.setFlags(
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
            )
        }
    }

    override fun showNetworkConnectionDialog() {

    }

    override fun getCardInfos() {
        this.mPresenter.getCardInfos()
    }

    override fun showLoadingView() {

    }

    override fun hideLoadingView() {

    }

    override fun goToMainActivity(intent: Intent) {
        startActivity(intent)
        finish()
    }
}