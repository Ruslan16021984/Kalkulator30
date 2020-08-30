package com.gmail3333333.kalkulator30.di.components;

import com.gmail3333333.kalkulator30.di.modules.DataBaseModule;
import com.gmail3333333.kalkulator30.di.modules.PowerTransModule;
import com.gmail3333333.kalkulator30.fragments.powerTrans.tabs.TabsPowerWnTransFragment;

import dagger.Component;

@Component(modules = {PowerTransModule.class, DataBaseModule.class})
public interface PowerTransComponent {
    void inject(TabsPowerWnTransFragment transFragment);
}
