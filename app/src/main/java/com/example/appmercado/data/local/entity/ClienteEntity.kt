package com.example.appmercado.data.local.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.Date

@Entity(tableName = "Cliente")
data class ClienteEntity(
    @PrimaryKey(autoGenerate = true)
    val id_cliente: Long = 0,

    @ColumnInfo("nome_cliente")
    val nome_cliente: String?,

    @ColumnInfo("estado_cliente")
    val estado_cliente: String?,

    @ColumnInfo("datanas_cliente")
    val datanas_cliente: Date?,

    @ColumnInfo("cpf_cliente")
    val cpf_cliente: String?
    )
