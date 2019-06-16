package com.rahgena.dlatih.Model.Method;
import com.google.gson.annotations.SerializedName;
import com.rahgena.dlatih.Model.User;

public class Users {
    User mUser;
    @SerializedName("status") String status;
    @SerializedName("message") String message;
    @SerializedName("data") User dUser;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public User getUser(){
        return dUser;
    }

    public void setUser(User user){
        dUser = user;
    }
}