package com.example.aldhantask4

import com.example.aldhantask4.pojo.AladhanResponseModel
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface RetrofitInterface {
    @GET("timingsByCity")
    fun getTimings(
        @Query("city") city : String,
        @Query("country") country : String,
        @Query("method") method : Int
    ) : Call<AladhanResponseModel>




}