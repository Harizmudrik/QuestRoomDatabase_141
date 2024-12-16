package com.example.prak7pam.data.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.prak7pam.data.entity.Mahasiswa
import kotlinx.coroutines.flow.Flow


@Dao
interface MahasiswaDao {
    //fungsi get all data
    @Query("select * from mahasiswa")
    fun getAllMahasiswa() : Flow<List<Mahasiswa>>

    // get Mahasiswa
    @Query("SELECT * FROM mahasiswa WHERE nim = :nim")
    fun getMahasiswa(nim: String): Flow<Mahasiswa> // Data diambil berdasarkan NIM

    // Delete Mahasiswa
    @Delete
    suspend fun deleteMahasiswa(mahasiswa: Mahasiswa) // Suspend digunakan dengan coroutine

    // Update Mahasiswa
    @Update
    suspend fun updateMahasiswa(mahasiswa: Mahasiswa) // Memperbarui data di tabel

    @Insert
    suspend fun insertMahasiswa(
        mahasiswa: Mahasiswa
    )
}