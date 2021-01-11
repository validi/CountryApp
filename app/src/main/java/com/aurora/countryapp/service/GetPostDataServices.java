package com.aurora.countryapp.service;


import com.aurora.countryapp.model.Country;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface GetPostDataServices {



    @GET("/rest/v2/name/{name}?fullText=true")
    Call<Object> getCountry(@Path("name")String name);
}
