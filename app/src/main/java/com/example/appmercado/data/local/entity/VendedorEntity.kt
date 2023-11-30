package com.example.appmercado.data.local.entity

import androidx.room.ColumnInfo
import androidx.room.PrimaryKey

data class VendedorEntity(
    @PrimaryKey(autoGenerate = true)
    val id_vendedor: Long = 0,

    @ColumnInfo("nome_vendedor")
    val nome_vendedor: String?,

    @ColumnInfo("tel_vendedor")
    val tel_vendedor: String?,

    @ColumnInfo("estado_vendedor")
    val estado_vendedor: String?,



)
