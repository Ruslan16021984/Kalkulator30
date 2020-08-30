package com.gmail3333333.kalkulator30.models.powerTrans;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

import static androidx.room.ForeignKey.CASCADE;

@Entity(foreignKeys = @ForeignKey(entity = Winding.class,
        parentColumns = "id",
        childColumns = "winding_id", onDelete = CASCADE))
public class PositionWindings {
    @PrimaryKey
    private int id;
    private String position;
    private double showedAmper;
    private double showedVoltAmper;
    private double degrees;
    private double beforeData;
    private double resultOf10Amper;
    private double resultOf20Degrees;
    private double divergence;
    @ColumnInfo(name = "winding_id")
    private int windingId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getShowedAmper() {
        return showedAmper;
    }

    public void setShowedAmper(double showedAmper) {
        this.showedAmper = showedAmper;
    }

    public double getShowedVoltAmper() {
        return showedVoltAmper;
    }

    public void setShowedVoltAmper(double showedVoltAmper) {
        this.showedVoltAmper = showedVoltAmper;
    }

    public double getDegrees() {
        return degrees;
    }

    public void setDegrees(double degrees) {
        this.degrees = degrees;
    }

    public double getBeforeData() {
        return beforeData;
    }

    public void setBeforeData(double beforeData) {
        this.beforeData = beforeData;
    }

    public double getResultOf10Amper() {
        return resultOf10Amper;
    }

    public void setResultOf10Amper(double resultOf10Amper) {
        this.resultOf10Amper = resultOf10Amper;
    }

    public double getResultOf20Degrees() {
        return resultOf20Degrees;
    }

    public void setResultOf20Degrees(double resultOf20Degrees) {
        this.resultOf20Degrees = resultOf20Degrees;
    }

    public double getDivergence() {
        return divergence;
    }

    public void setDivergence(double divergence) {
        this.divergence = divergence;
    }

    public int getWindingId() {
        return windingId;
    }

    public void setWindingId(int windingId) {
        this.windingId = windingId;
    }
}
