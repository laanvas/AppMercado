package com.example.appmercado.data.local.model

import androidx.room.Entity


@Entity
data class VendedorResponse(
    val id_vendedor: Int,
    val nome_vendedor: String?,
    val tel_vendedor: String?,
    val estado_vendedor: String?
)
