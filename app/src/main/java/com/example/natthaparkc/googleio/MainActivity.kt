package com.example.natthaparkc.googleio

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.natthaparkc.googleio.ui.ScheduleFragment
import com.example.natthaparkc.googleio.ui.ScheduleViewModel
import com.example.natthaparkc.googleio.util.inTransaction
import com.example.natthaparkc.googleio.util.viewModelProvider
import dagger.android.support.DaggerAppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : DaggerAppCompatActivity() {

    companion object {
        private const val FRAGMENT_ID = R.id.fragment_container
    }

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val scheduleViewModel: ScheduleViewModel = viewModelProvider(viewModelFactory)

        setupNavigation()
    }

    private fun setupNavigation() {
        navigation.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.navigation_info -> { true}
                R.id.navigation_schedule -> { true }
                R.id.navigation_map -> { true }
                else -> false
            }
        }
    }

    private fun <F> replaceFragment(fragment: F) where F : Fragment {
        supportFragmentManager.inTransaction {
            replace(FRAGMENT_ID, fragment)
        }
    }

}
