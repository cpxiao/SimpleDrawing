package com.cpxiao.drawing.fragment;

import android.os.Bundle;
import android.view.View;

import com.cpxiao.R;
import com.cpxiao.gamelib.fragment.BaseZAdsFragment;
import com.cpxiao.zads.core.ZAdPosition;

/**
 * @author cpxiao on 2017/09/04.
 */

public class HomeFragment extends BaseZAdsFragment {


    public static HomeFragment newInstance(Bundle bundle) {
        HomeFragment fragment = new HomeFragment();
        if (bundle != null) {
            fragment.setArguments(bundle);
        }
        return fragment;
    }

    @Override
    protected void initView(View view, Bundle savedInstanceState) {
        loadAds();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_home;
    }


    private void loadAds() {
        loadZAds(ZAdPosition.POSITION_HOME);
    }


}
