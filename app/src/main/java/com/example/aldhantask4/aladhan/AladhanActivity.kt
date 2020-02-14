package com.example.aldhantask4.aladhan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.aldhantask4.R
import com.example.aldhantask4.pojo.Timings
import com.example.aldhantask4.toPersianNumber
import kotlinx.android.synthetic.main.activity_aladhan.*

class AladhanActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_aladhan)

        val presenter = AladhanPresenter(this)

        btnSearch.setOnClickListener {

            presenter.onSearchClicked()
        }
    }

    fun getCity()= edtCity.text.toString()
    fun getCountry()= edtCountry.text.toString()

    fun setTimings(prayerTimings: Timings?){

        txtSunrise.text = prayerTimings?.Sunrise!!.toPersianNumber()
        txtDhuhr.text = prayerTimings.Dhuhr.toPersianNumber()
        txtAsr.text = prayerTimings.Asr.toPersianNumber()
        txtSunset.text= prayerTimings.Sunset.toPersianNumber()
        txtMaghrib.text = prayerTimings.Maghrib.toPersianNumber()
        txtIsha.text = prayerTimings.Isha.toPersianNumber()
        txtMidnight.text = prayerTimings.Midnight.toPersianNumber()
    }
}
