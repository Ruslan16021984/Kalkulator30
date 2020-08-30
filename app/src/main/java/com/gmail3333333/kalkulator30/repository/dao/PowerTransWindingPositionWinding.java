package com.gmail3333333.kalkulator30.repository.dao;

import androidx.room.Embedded;
import androidx.room.Relation;

import com.gmail3333333.kalkulator30.models.powerTrans.Winding;

import java.util.List;

public class PowerTransWindingPositionWinding {
    public String name;
    @Embedded
    public Winding winding;

    @Relation(parentColumn = "id" , entityColumn = "powertrans_id")
    public List<Winding> powerTrans;

}
