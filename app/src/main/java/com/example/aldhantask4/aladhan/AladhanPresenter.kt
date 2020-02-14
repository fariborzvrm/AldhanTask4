package com.example.aldhantask4.aladhan

import com.example.aldhantask4.pojo.Timings

class AladhanPresenter(val view : AladhanActivity):AladhanContract.PresenterContract {
    val model = AladhanModel(this)


    override fun onSearchClicked(){
        val city = view.getCity()
        val country = view.getCountry()
        model.getTimingsData(city,country,8)
    }

    override fun retrofitResponse(prayerTimings: Timings?){
        view.setTimings(prayerTimings)
    }
}