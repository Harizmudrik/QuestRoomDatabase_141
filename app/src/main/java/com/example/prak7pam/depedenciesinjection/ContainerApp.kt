package com.example.prak7pam.depedenciesinjection

import android.content.Context
import com.example.prak7pam.data.database.KrsDatabase
import com.example.prak7pam.repository.LocalRepositoryMhs
import com.example.prak7pam.repository.RepositoryMhs

interface InterfaceContainerApp {
    val repositoryMhs: RepositoryMhs
}

class ContainerApp(private val context: Context) : InterfaceContainerApp{
    override val repositoryMhs: RepositoryMhs by lazy {
        LocalRepositoryMhs(KrsDatabase.getDatabase(context).mahasiswaDao())
    }
}