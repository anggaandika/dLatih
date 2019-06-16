package com.rahgena.dlatih.Model;

import com.google.gson.annotations.SerializedName;

public class User {
    @SerializedName("id") private String id;
    @SerializedName("name") private String nama;
    @SerializedName("username") private String username;
    @SerializedName("email") private String email;
    @SerializedName("alamat") private String alamat;
    @SerializedName("jenis_kelamin") private String jenis_kelamin;
    @SerializedName("no_tlp") private String tlp;
    @SerializedName("password") private String password;
    @SerializedName("photo") private String photo;

    public User(){}

    public User(String id,String password , String name, String username, String email, String alamat, String tlp, String photo)
    {
        this.id = id;
        this.nama = name;
        this.username = username;
        this.email = email;
        this.alamat = alamat;
        this.tlp = tlp;
        this.photo = photo;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getJenis_kelamin() {
        return jenis_kelamin;
    }

    public void setJenis_kelamin(String jenis_kelamin) {
        this.jenis_kelamin = jenis_kelamin;
    }

    public String getTlp() {
        return tlp;
    }

    public void setTlp(String tlp) {
        this.tlp = tlp;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
}