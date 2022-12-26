package android.example.myapplication.data.repozitory

import android.example.myapplication.Model.beznal.Beznal
import android.example.myapplication.Model.nalichka.Nal
import android.example.myapplication.data.api.RetrofitInstance
import retrofit2.Response

class Repository {
    suspend fun getNal(): Response<Nal> {
        return RetrofitInstance.api.getNalMoneys()
    }

    suspend fun getBeznal(): Response<Beznal> {
        return RetrofitInstance.api.getBeznalMoney()
    }
}