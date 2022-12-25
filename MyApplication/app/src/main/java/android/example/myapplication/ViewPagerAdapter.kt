package android.example.myapplication


import androidx.fragment.app.Fragment
import android.example.myapplication.screens.second.SecondFragment
import android.example.myapplication.screens.start.StartFragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerAdapter(fragmentActivity: FragmentActivity) :FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
        return when(position) {
            0 -> StartFragment()
            else -> SecondFragment()
        }
    }
}