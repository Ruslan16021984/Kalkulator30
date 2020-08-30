package com.gmail3333333.kalkulator30.fragments.voltagtrans;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gmail3333333.kalkulator30.R;
import com.gmail3333333.kalkulator30.customTabLayout.SlidingTabLayout;
import com.gmail3333333.kalkulator30.fragments.voltagtrans.adapter.VoltageTransPagerAdapter;

/**
 * A simple {@link Fragment} subclass.
 */
public class VoltageTransFragment extends Fragment {
    private VoltageTransPagerAdapter adapter;
    private SlidingTabLayout slidingTabLayout;
    private ViewPager viewPager;

    public VoltageTransFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_voltage_trans, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        viewPager = view.findViewById(R.id.viewpager);
        adapter =  new VoltageTransPagerAdapter(getActivity(),getChildFragmentManager());
        viewPager.setAdapter(adapter);

        slidingTabLayout = view.findViewById(R.id.sliding_tabs);
        slidingTabLayout.setDistributeEvenly(true);
        slidingTabLayout.setViewPager(viewPager);
    }
}
