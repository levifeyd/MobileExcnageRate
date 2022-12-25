package android.example.myapplication.screens.splash

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.example.myapplication.R
import androidx.navigation.Navigation
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_splash, container, false)
        CoroutineScope(Dispatchers.Main).launch {// корутина запускается и подождет 1.5 секунды в гланом потоке
            delay(2000)
            Navigation.findNavController(view).navigate(R.id.action_splashFragment_to_rootFragment)
        }
        // Inflate the layout for this fragment
        return view
    }

}