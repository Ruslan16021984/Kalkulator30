package com.gmail3333333.kalkulator30.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.gmail3333333.kalkulator30.models.powerTrans.PositionWindings;
import com.gmail3333333.kalkulator30.models.powerTrans.PowerTrans;
import com.gmail3333333.kalkulator30.models.powerTrans.Winding;
import com.gmail3333333.kalkulator30.repository.dao.PowerTransDao;

@Database(entities = {PowerTrans.class, Winding.class, PositionWindings.class}, version = 1)
public abstract class DataBaseUvvi extends RoomDatabase {
    public abstract PowerTransDao powerTransDao();
}
