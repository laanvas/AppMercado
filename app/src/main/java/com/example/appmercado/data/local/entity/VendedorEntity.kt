package com.example.appmercado.data.local.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Vendedor")
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
