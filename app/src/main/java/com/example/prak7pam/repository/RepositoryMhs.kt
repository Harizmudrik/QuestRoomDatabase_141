package com.example.prak7pam.repository

import com.example.prak7pam.data.entity.Mahasiswa
import kotlinx.coroutines.flow.Flow

//panduan

interface RepositoryMhs {
    suspend fun insertMhs(mahasiswa: Mahasiswa)

    fun getAllMahasiswa(): Flow<List<Mahasiswa>>
}