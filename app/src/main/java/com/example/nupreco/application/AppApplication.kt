package com.example.nupreco.application

import android.app.Application
import com.example.nupreco.di.daoModule
import com.example.nupreco.di.repositoryModule
import com.example.nupreco.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin


class AppApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@AppApplication)
            modules(viewModelModule)
            modules(repositoryModule)
            modules(daoModule)
        }
    }

}