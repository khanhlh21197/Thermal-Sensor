package com.themarpe.openthermalcamera.model;

import androidx.annotation.NonNull;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class HHA000001 {

    @SerializedName("ND")
    @Expose
    private String ND;

    public String getND() {
        return ND;
    }

    public void setND(String ND) {
        this.ND = ND;
    }

    @NonNull
    @Override
    public String toString() {
        return ND;
    }
}
