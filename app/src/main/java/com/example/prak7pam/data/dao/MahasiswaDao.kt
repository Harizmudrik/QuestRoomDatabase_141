package com.example.prak7pam.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.prak7pam.data.entity.Mahasiswa
import kotlinx.coroutines.flow.Flow


@Dao
interface MahasiswaDao {
    //fungsi get all data
    @Query("select * from mahasiswa")
    fun getAllMahasiswa() : Flow<List<Mahasiswa>>



    @Insert
    suspend fun insertMahasiswa(
        mahasiswa: Mahasiswa
    )
}