package com.themarpe.openthermalcamera.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Temp {

    @SerializedName("HHA000001")
    @Expose
    private HHA000001 HHA000001;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("username")
    @Expose
    private String username;

    public HHA000001 getHHA000001() {
        return HHA000001;
    }

    public void setHHA000001(HHA000001 hHA000001) {
        this.HHA000001 = hHA000001;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

}
