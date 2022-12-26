package android.example.myapplication.screens.start

import android.example.myapplication.Model.nalichka.Nal
import android.example.myapplication.data.repozitory.Repository
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import retrofit2.Response

class StartViewModel:ViewModel() {

    var repo = Repository()
    val myMoneyList: MutableLiveData<Response<Nal>> = MutableLiveData()

    fun getNalMoney () {
        viewModelScope.launch {
            myMoneyList.value = repo.getNal()

        }
    }

}