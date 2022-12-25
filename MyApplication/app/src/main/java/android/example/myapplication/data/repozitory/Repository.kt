package android.example.myapplication.data.repozitory

import android.example.myapplication.Model.beznal.Beznal
import android.example.myapplication.Model.beznal.BeznalItem
import android.example.myapplication.Model.nalichka.Nalichka
import android.example.myapplication.Model.nalichka.NalichkaItem
import android.example.myapplication.data.api.RetrofitInstance
import retrofit2.Response
import retrofit2.Retrofit

class Repository {
    suspend fun getNal(): Response<Nalichka> {
        return RetrofitInstance.api.getNalMoneys()
    }

    suspend fun getBeznal(): Response<Beznal> {
        return RetrofitInstance.api.getBeznalMoney()
    }
}