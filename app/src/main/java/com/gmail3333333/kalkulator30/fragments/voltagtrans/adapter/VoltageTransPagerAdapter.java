package com.gmail3333333.kalkulator30.fragments.voltagtrans.adapter;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.gmail3333333.kalkulator30.base.BaseFragment;
import com.gmail3333333.kalkulator30.fragments.voltagtrans.tabs.AxFragment;
import com.gmail3333333.kalkulator30.fragments.voltagtrans.tabs.NnFragment;

import java.util.HashMap;
import java.util.Map;

public class VoltageTransPagerAdapter extends FragmentPagerAdapter {
    private Map<Integer, BaseFragment> tabs;
    private Context context;

    public VoltageTransPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.context = context;
        initTabMap();
    }

    private void initTabMap() {
        tabs = new HashMap<>();
        tabs.put(0, AxFragment.getInstance(context));
        tabs.put(1, NnFragment.getInstance(context));
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

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return tabs.get(position).getTitle();
    }
}
