package com.example.natthaparkc.googleio.ui


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.natthaparkc.googleio.MainNavigationFragment

import com.example.natthaparkc.googleio.R
import com.example.natthaparkc.googleio.util.activityViewModelProvider
import dagger.android.support.DaggerFragment
import javax.inject.Inject

class ScheduleFragment : DaggerFragment() {

    @Inject lateinit var viewModelFactory: ViewModelProvider.Factory

    private lateinit var scheduleViewModel: ScheduleViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        scheduleViewModel = activityViewModelProvider(viewModelFactory)


        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_schedule, container, false)
    }

}
