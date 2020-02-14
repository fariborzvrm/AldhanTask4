package com.example.aldhantask4.aladhan

import com.example.aldhantask4.pojo.Timings

interface AladhanContract {
    interface ViewContract{
        fun setTimings(prayerTimings: Timings?)
        fun getCountry(): String
        fun getCity() : String

    }

    interface PresenterContract{

        fun retrofitResponse( prayerTimings: Timings?)
        fun onSearchClicked()
            }
}