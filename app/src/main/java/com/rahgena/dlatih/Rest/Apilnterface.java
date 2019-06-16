package com.rahgena.dlatih.Rest;

import com.rahgena.dlatih.Model.Method.Auths;
import com.rahgena.dlatih.Model.Method.Users;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.HTTP;
import retrofit2.http.POST;
import retrofit2.http.PUT;
public interface Apilnterface {
    @FormUrlEncoded
    @POST("user")
    Call<Users> registrasi(@Field("name") String name,
                           @Field("email") String email,
                           @Field("password") String password,
                           @Field("alamat") String alamat);
    // Fungsi ini untuk memanggil API http://10.0.2.2/mahasiswa/login.php
    @FormUrlEncoded
    @POST("auth")
    Call<Auths> loginRequest(@Field("email") String email,
                             @Field("password") String password);
}