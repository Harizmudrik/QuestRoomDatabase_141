package com.example.prak7pam.data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "mahasiswa")
class Mahasiswa (
    @PrimaryKey
    val nim: String,
    val nama: String,
    val alamat: String,
    val jenisKelamin: String,
    val kelas: String,
    val angkatan: String,
    )