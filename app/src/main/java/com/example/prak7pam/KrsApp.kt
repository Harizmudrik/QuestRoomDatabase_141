package com.example.prak7pam

import android.app.Application
import com.example.prak7pam.depedenciesinjection.ContainerApp

class KrsApp : Application() {
    lateinit var containerApp: ContainerApp

    override fun onCreate() {
        super.onCreate()

        containerApp = ContainerApp(this)
    }
}