package com.aurora.countryapp.service;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClientInstance {

    private static Retrofit retrofit;


    private static final String BASE_URL = "https://restcountries.eu";


 public static GetPostDataServices getCountryRetrofitInstance() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())

                    .build();
        }
        return retrofit.create(GetPostDataServices.class);
    }



}