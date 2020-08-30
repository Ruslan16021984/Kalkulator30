package com.gmail3333333.kalkulator30.fragments.powerTrans.adapter;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.gmail3333333.kalkulator30.base.BaseFragment;
import com.gmail3333333.kalkulator30.fragments.powerTrans.tabs.TabsNNPowerTransFragment;
import com.gmail3333333.kalkulator30.fragments.powerTrans.tabs.TabsPowerWnTransFragment;

import java.util.HashMap;
import java.util.Map;

public class PowerPagerAdapter extends FragmentPagerAdapter {
    private Map<Integer, BaseFragment> tabs;
    private Context context;

    public PowerPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.context = context;
        initTabMap();
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
       return tabs.get(position);
    }

    @Override
    public int getCount() {
        return tabs.size();
    }
    @Override
    public CharSequence getPageTitle(int position) {
        return tabs.get(position).getTitle();
    }
    private void initTabMap() {
        tabs = new HashMap<>();
        tabs.put(0, TabsPowerWnTransFragment.getInstance(context));
        tabs.put(1, TabsNNPowerTransFragment.getInstance(context));
    }
}
