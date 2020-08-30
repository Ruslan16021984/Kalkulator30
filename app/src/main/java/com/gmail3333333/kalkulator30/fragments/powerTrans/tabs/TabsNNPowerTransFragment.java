package com.gmail3333333.kalkulator30.fragments.powerTrans.tabs;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gmail3333333.kalkulator30.R;
import com.gmail3333333.kalkulator30.base.BaseFragment;


public class TabsNNPowerTransFragment extends BaseFragment {

    public static TabsNNPowerTransFragment getInstance(Context context) {
        TabsNNPowerTransFragment tabsNNPowerTransFragment = new TabsNNPowerTransFragment();
        Bundle args = new Bundle();
        tabsNNPowerTransFragment.setArguments(args);
        tabsNNPowerTransFragment.setContext(context);
        tabsNNPowerTransFragment.setTitle(context.getString(R.string.powerWn));
        return tabsNNPowerTransFragment;
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tabs_nn_power_trans, container, false);
    }

}
