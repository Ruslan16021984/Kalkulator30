package com.gmail3333333.kalkulator30.di.modules;


import com.gmail3333333.kalkulator30.App;
import com.gmail3333333.kalkulator30.database.DataBaseUvvi;
import com.gmail3333333.kalkulator30.models.powerTrans.PowerTrans;
import com.gmail3333333.kalkulator30.repository.dao.PowerTransDao;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class DataBaseModule {
    @Provides
    @Singleton
    public DataBaseUvvi dataBaseUvvi(){
        DataBaseUvvi db;
        return  db = App.getInstance().getDatabase();
    }
    @Provides
    @Singleton
    public PowerTransDao powerTransDao(DataBaseUvvi db){
        PowerTransDao powerTransDao;
        return powerTransDao = db.powerTransDao();
    }
}
