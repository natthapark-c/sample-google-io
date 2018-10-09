package com.example.natthaparkc.googleio.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import javax.inject.Inject


class TestViewmodelFactory @Inject constructor(private val testString: String) : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return TestViewModel(testString) as T
    }

}