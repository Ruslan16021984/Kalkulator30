package com.gmail3333333.kalkulator30;

import android.app.Application;

import androidx.room.Room;

import com.gmail3333333.kalkulator30.database.DataBaseUvvi;

public class App extends Application {
    public static App instance;
    private DataBaseUvvi dataBaseUvvi;
    @Override
    public void onCreate() {
        super.onCreate();
        dataBaseUvvi = Room.databaseBuilder(this, DataBaseUvvi.class, "database").build();
    }

    public static App getInstance() {
        return instance;
    }
    public DataBaseUvvi getDatabase() {
        return dataBaseUvvi;
    }
}
