package com.gmail3333333.kalkulator30.repository.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Transaction;
import androidx.room.Update;

import com.gmail3333333.kalkulator30.models.powerTrans.PositionWindings;
import com.gmail3333333.kalkulator30.models.powerTrans.PowerTrans;
import com.gmail3333333.kalkulator30.models.powerTrans.Winding;

import java.util.List;

import io.reactivex.Flowable;

@Dao
public abstract class PowerTransDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    public abstract long insertPowerTrans(PowerTrans powerTrans);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    public abstract long insertWinding(Winding winding);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    public abstract long insertPositionWinding(PositionWindings positionWindings);

    @Transaction
    public  void insertTransWindingPosition(PowerTrans powerTrans, Winding winding, PositionWindings positionWindings){
        insertPowerTrans(powerTrans);
        insertWinding(winding);
        insertPositionWinding(positionWindings);
    }

    @Update
    public abstract void updatePowerTrans(PowerTrans powerTrans);

    @Update
    public abstract void updateWinding(Winding winding);

    @Update
    public abstract void updatePositionWindings(PositionWindings positionWindings);

    @Delete
    public abstract void deletePowerTrans(PowerTrans powerTrans);

    @Transaction
    @Query("SELECT * from PowerTrans WHERE number = :number")
    public abstract List<PowerTransWindingPositionWinding> getWindingWithPosition(int number);

}
