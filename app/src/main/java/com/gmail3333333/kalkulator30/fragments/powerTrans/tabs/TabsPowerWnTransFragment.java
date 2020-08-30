package com.gmail3333333.kalkulator30.fragments.powerTrans.tabs;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.room.Insert;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.RadioGroup;

import com.gmail3333333.kalkulator30.R;
import com.gmail3333333.kalkulator30.base.BaseFragment;
import com.gmail3333333.kalkulator30.di.components.DaggerPowerTransComponent;
import com.gmail3333333.kalkulator30.di.modules.PowerTransModule;
import com.gmail3333333.kalkulator30.mvp.PowerTransform;
import com.gmail3333333.kalkulator30.mvp.PowerTransformPresenter;
import com.gmail3333333.kalkulator30.repository.dao.PowerTransDao;

import javax.inject.Inject;

/**
 * A simple {@link Fragment} subclass.
 */
public class TabsPowerWnTransFragment extends BaseFragment implements PowerTransform.View, View.OnClickListener{
    @Inject
    PowerTransDao powerTransDao;
    private String perlaseMnozitel = "0";
    private Button converter;
    private RadioGroup mRadioOsGroup;
    String[] faza = {"AB", "BC", "AC"};
    String[] polozenie = {"2-3", "3-4", "5-6", "4-5", "2-4"};
    @Inject
    PowerTransformPresenter presenter;

    public static TabsPowerWnTransFragment getInstance(Context context) {
        TabsPowerWnTransFragment tabsNNPowerTransFragment = new TabsPowerWnTransFragment();
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
        View view= inflater.inflate(R.layout.fragment_tab_wn_trans, container, false);
        DaggerPowerTransComponent.builder()
                .powerTransModule(new PowerTransModule(this, view))
                .build().inject(this);
        converter = view.findViewById(R.id.button);
        mRadioOsGroup = view.findViewById(R.id.radio1);
        mRadioOsGroup.setOnCheckedChangeListener((group, checkedId) -> {
            switch (checkedId) {
                case R.id.x1:
                    perlaseMnozitel = "x1";
                    break;
                case R.id.x2:
                    perlaseMnozitel = "x2";
                    break;
                case R.id.x3:
                    perlaseMnozitel = "x3";
                    break;
            }
        });
        converter.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
//        final Animation animAlpha = AnimationUtils.loadAnimation(getActivity(), R.anim.alpha);
//        v.startAnimation(animAlpha);
        switch (v.getId()) {
            case R.id.button:
                String oper = "";
                if (perlaseMnozitel.equals("0")) {
//                    Toast.makeText(getActivity(), "выберите флажок x1,x2 или x3 ", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (perlaseMnozitel.equals("x1")) {
                    float x = 1;
                    presenter.makeCount(x);
                } else if (perlaseMnozitel.equals("x2")) {
                    float x = 2;
                    presenter.makeCount(x);
                } else if (perlaseMnozitel.equals("x3")) {
                    float x = 3;
                    presenter.makeCount(x);

                }

                break;

        }
    }

    @Override
    public void showOpenFileDialog() {

    }
}
