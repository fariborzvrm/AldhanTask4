package com.example.aldhantask4.aladhan

import com.example.aldhantask4.RetrofitInterface
import com.example.aldhantask4.pojo.AladhanResponseModel
import retrofit2.*
import retrofit2.converter.gson.GsonConverterFactory

class AladhanModel ( val presenter: AladhanPresenter) {
    fun getTimingsData( city : String , country : String , method : Int){


        val retrofit = Retrofit.Builder()
            .baseUrl(" https://api.aladhan.com/v1/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        val timingInterface = retrofit.create(RetrofitInterface::class.java)
        timingInterface.getTimings(city , country , method )
            .enqueue(object : Callback<AladhanResponseModel>{
                override fun onFailure(call: Call<AladhanResponseModel>, t: Throwable) {
                    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
                }

                override fun onResponse(
                    call: Call<AladhanResponseModel>,
                    response: Response<AladhanResponseModel>
                ) {
                    val results = response.body()?.data?.timings
                    presenter.retrofitResponse(results)
                }
            })



    }
}