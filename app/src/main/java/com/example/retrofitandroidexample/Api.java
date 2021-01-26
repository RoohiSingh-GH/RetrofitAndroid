package com.example.retrofitandroidexample;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {
    String BASE_URL = "https://simplifiedcoding.net/demos/";

    @GET("marvel")  //http GET request
    Call<List<Hero>> getHeroes();
}
