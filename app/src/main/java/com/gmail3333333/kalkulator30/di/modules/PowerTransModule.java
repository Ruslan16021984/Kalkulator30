package com.gmail3333333.kalkulator30.di.modules;

import android.view.View;

import com.gmail3333333.kalkulator30.mvp.PowerTransform;

import dagger.Module;
import dagger.Provides;

@Module
public class PowerTransModule {
    private PowerTransform.View view;
    private View viewLayout;

    public PowerTransModule(PowerTransform.View view, View viewLayout) {
        this.view = view;
        this.viewLayout = viewLayout;
    }

    @Provides
    PowerTransform.View providePowerTransformView() {
        return view;
    }
    @Provides
    View provideView(){
        return viewLayout;
    }

}
