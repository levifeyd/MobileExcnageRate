package android.example.myapplication.data.api

import android.example.myapplication.Model.beznal.Beznal
import android.example.myapplication.Model.nalichka.Nal
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET("p24api/pubinfo?json&exchange&coursid=5")   // endpoints
    suspend fun getNalMoneys():Response<Nal>

    @GET("p24api/pubinfo?exchange&coursid=11")
    suspend fun getBeznalMoney():Response<Beznal>
}