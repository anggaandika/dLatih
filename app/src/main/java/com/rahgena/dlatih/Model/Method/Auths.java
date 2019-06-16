package com.rahgena.dlatih.Model.Method;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.rahgena.dlatih.Model.Auth;

public class Auths {

    @SerializedName("status")
    @Expose
    private Boolean status;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("data")
    @Expose
    private Auth data;

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Auth getData() {
        return data;
    }

    public void setData(Auth data) {
        this.data = data;
    }

}