package com.gmail3333333.kalkulator30.fragments.powerTrans;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.gmail3333333.kalkulator30.R;
import com.gmail3333333.kalkulator30.customTabLayout.SlidingTabLayout;
import com.gmail3333333.kalkulator30.fragments.powerTrans.adapter.PowerPagerAdapter;

public class PowerTransFragment extends Fragment {


    private PowerPagerAdapter adapter;
    private SlidingTabLayout slidingTabLayout;
    private ViewPager viewPager;
    CharSequence Titles[]={"Обмотка ВН","Обмотка НН"};
    //CharSequence Titles[]={"Магазини","Послуги"};
    int Numboftabs = 2;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_power_trans, container, false);
        // Inflate the layout for this fragment,
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        viewPager = view.findViewById(R.id.viewpager);
        adapter =  new PowerPagerAdapter(getActivity(),getChildFragmentManager());
        viewPager.setAdapter(adapter);

        slidingTabLayout = view.findViewById(R.id.sliding_tabs);
        slidingTabLayout.setDistributeEvenly(true);
        slidingTabLayout.setViewPager(viewPager);
    }

}
