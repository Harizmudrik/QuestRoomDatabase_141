package com.example.prak7pam.repository

import com.example.prak7pam.data.entity.Mahasiswa
import kotlinx.coroutines.flow.Flow

//panduan

interface RepositoryMhs {
    suspend fun insertMhs(mahasiswa: Mahasiswa)
    //getALlmhs
    fun getAllMahasiswa(): Flow<List<Mahasiswa>>

    //getMhs
    fun getMhs(nim: String): Flow<Mahasiswa> // Mengambil data mahasiswa berdasarkan NIM
}