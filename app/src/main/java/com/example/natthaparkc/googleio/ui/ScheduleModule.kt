package com.example.natthaparkc.googleio.ui

import androidx.lifecycle.ViewModel
import com.example.natthaparkc.googleio.di.FragmentScoped
import com.example.natthaparkc.googleio.di.ViewModelKey
import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector
import dagger.multibindings.IntoMap

@Module
internal abstract class ScheduleModule {

    @FragmentScoped
    @ContributesAndroidInjector()
    internal abstract fun contributeScheduleFragment(): ScheduleFragment

    @Binds
    @IntoMap
    @ViewModelKey(ScheduleViewModel::class)
    abstract fun bindScheduleViewModel(viewModel: ScheduleViewModel): ViewModel

}