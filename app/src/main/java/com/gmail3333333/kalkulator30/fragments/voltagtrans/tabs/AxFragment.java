package com.gmail3333333.kalkulator30.fragments.voltagtrans.tabs;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gmail3333333.kalkulator30.R;
import com.gmail3333333.kalkulator30.base.BaseFragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class AxFragment extends BaseFragment {

    public static AxFragment getInstance(Context context) {
        AxFragment fragment = new AxFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        fragment.setContext(context);
        fragment.setTitle(context.getString(R.string.voltageAx));
        return fragment;
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_ax, container, false);
    }
}
