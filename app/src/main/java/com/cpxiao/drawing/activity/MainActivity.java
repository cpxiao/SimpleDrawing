package com.cpxiao.drawing.activity;

import android.os.Bundle;

import com.cpxiao.drawing.fragment.HomeFragment;
import com.cpxiao.gamelib.activity.BaseZAdsActivity;
import com.cpxiao.gamelib.fragment.BaseFragment;
import com.cpxiao.zads.ZAdManager;
import com.cpxiao.zads.core.ZAdPosition;

public class MainActivity extends BaseZAdsActivity {

    @Override
    protected BaseFragment getFirstFragment() {
        return HomeFragment.newInstance(null);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ZAdManager.getInstance().init(getApplicationContext());
        loadAd();
    }

    public void loadAd() {
        initAdMobAds100("ca-app-pub-4157365005379790/8263455265");
        initFbAds90("132313060642929_170197080187860");
        loadZAds(ZAdPosition.POSITION_MAIN);
    }

}
