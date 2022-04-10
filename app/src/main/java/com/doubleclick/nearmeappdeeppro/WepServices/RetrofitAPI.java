package com.doubleclick.nearmeappdeeppro.WepServices;


import com.doubleclick.nearmeappdeeppro.Model.DirectionPlaceModel.DirectionResponseModel;
import com.doubleclick.nearmeappdeeppro.Model.GooglePlaceModel.GoogleResponseModel;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface RetrofitAPI {

    @GET
    Call<GoogleResponseModel> getNearByPlaces(@Url String url);

    @GET
    Call<DirectionResponseModel> getDirection(@Url String url);
}
