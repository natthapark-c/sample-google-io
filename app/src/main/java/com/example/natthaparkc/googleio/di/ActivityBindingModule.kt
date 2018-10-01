package com.example.natthaparkc.googleio.di

import com.example.natthaparkc.googleio.MainActivity
import com.example.natthaparkc.googleio.ui.ScheduleModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBindingModule{

    @ActivityScoped
    @ContributesAndroidInjector(modules = [ScheduleModule::class])
    internal abstract fun mainActivity(): MainActivity


}