package com.maurya91.mydaggerapplication.base.di

import com.maurya91.mydaggerapplication.base.MyApplication
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector

@Component(
    modules = [
        AndroidInjectionModule::class,
        ApplicationModule::class,
        ActivityModule::class,
        ViewModelModule::class
    ]
)
interface MyApplicationComponent : AndroidInjector<MyApplication>