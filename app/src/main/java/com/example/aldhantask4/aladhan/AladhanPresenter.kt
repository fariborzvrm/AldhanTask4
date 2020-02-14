package com.example.aldhantask4.aladhan

import com.example.aldhantask4.pojo.Timings

class AladhanPresenter(val view : AladhanActivity) {
    val model = AladhanModel(this)


    fun onSearchClicked(){
        val city = view.getCity()
        val country = view.getCountry()
        model.getTimingsData(city,country,8)
    }

    fun retrofitResponse( prayerTimings: Timings?){
        view.setTimings(prayerTimings)
    }
}