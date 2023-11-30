package com.example.appmercado.data.local.model

import androidx.room.Entity


@Entity
data class ProdutoResponse(
    val id_produto: Int,
    val nome_produto: String?,
    val categoria_produto: String?,
    val desc_produto: String?,
    val preco_produto: Double?,
    val img: ByteArray,
    val id_vendedor: Int
)
