package com.example.prak7pam.repository

import com.example.prak7pam.data.dao.MahasiswaDao
import com.example.prak7pam.data.entity.Mahasiswa
import kotlinx.coroutines.flow.Flow

class LocalRepositoryMhs (
    private val mahasiswaDao: MahasiswaDao
) : RepositoryMhs {
    override suspend fun insertMhs(mahasiswa: Mahasiswa) {
        mahasiswaDao.insertMahasiswa(mahasiswa)
    }

    override fun getAllMahasiswa(): Flow<List<Mahasiswa>> {
        return mahasiswaDao.getAllMahasiswa()
    }

    override fun getMhs(nim: String): Flow<Mahasiswa> { // Mengambil data mahasiswa berdasarkan NIM
        return mahasiswaDao.getMahasiswa(nim) // Memanggil fungsi DAO untuk mendapatkan data sesuai NIM
    }

    override suspend fun deleteMhs(mahasiswa: Mahasiswa) { // Menghapus data mahasiswa
        mahasiswaDao.deleteMahasiswa(mahasiswa) // Memanggil fungsi DAO untuk mengahpus data mahasiswa dari tabel
    }

    override suspend fun updateMhs(mahasiswa: Mahasiswa) { // Memperbarui data mahasiswa
        mahasiswaDao.updateMahasiswa(mahasiswa) // Memanggil fungsi DAO untuk memperbarui data mahasiswa dari tabel
    }

}