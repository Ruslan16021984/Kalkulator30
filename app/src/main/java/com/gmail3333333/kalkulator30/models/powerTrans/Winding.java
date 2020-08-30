package com.gmail3333333.kalkulator30.models.powerTrans;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

import static androidx.room.ForeignKey.CASCADE;

@Entity(foreignKeys = @ForeignKey(entity = PowerTrans.class,
        parentColumns = "id",
        childColumns = "powertrans_id", onDelete = CASCADE))
public class Winding {
    @PrimaryKey
    private int id;
    @ColumnInfo(name = "winding_name")
    private String name;
    @ColumnInfo(name = "powertrans_id", index = true)
    private int powertransId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPowertransId() {
        return powertransId;
    }

    public void setPowertransId(int powertransId) {
        this.powertransId = powertransId;
    }
}
