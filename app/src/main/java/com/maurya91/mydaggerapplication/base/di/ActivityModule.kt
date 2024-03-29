package com.maurya91.mydaggerapplication.base.di

import com.maurya91.mydaggerapplication.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityModule {
    @ContributesAndroidInjector//(modules = [FragmentModule::class])
    abstract fun contributeMainActivity(): MainActivity
}