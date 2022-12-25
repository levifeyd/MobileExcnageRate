package android.example.myapplication.screens.second

import android.example.myapplication.Model.beznal.Beznal
import android.example.myapplication.data.repozitory.Repository
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import retrofit2.Response

class SecondViewModel:ViewModel() {
    var repo = Repository()
    val myMoneyList: MutableLiveData<Response<Beznal>> = MutableLiveData()

    fun getBezNalMoney () {
        viewModelScope.launch {
            myMoneyList.value = repo.getBeznal()

        }
    }
}