package com.example.appmercado.domain.local.repository

import com.example.appmercado.data.local.entity.ProdutoEntity
import java.util.concurrent.Flow

interface ProdutoLocalRepository {
    fun getAllProduto(): Flow<List<ProdutoEntity>>

    suspend fun getProdutoById(id_produto: Long): ProdutoEntity?

    suspend fun insertProduto(produtoEntity: ProdutoEntity): Long

    suspend fun updateProduto(produtoEntity: ProdutoEntity)

    suspend fun deleteProduto(produtoEntity: ProdutoEntity)
}