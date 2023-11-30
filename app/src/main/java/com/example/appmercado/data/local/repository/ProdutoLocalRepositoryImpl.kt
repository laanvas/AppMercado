package com.example.appmercado.data.local.repository

import com.example.appmercado.data.local.entity.ProdutoEntity
import com.example.appmercado.domain.local.repository.ProdutoLocalRepository

class ProdutoLocalRepositoryImpl: ProdutoLocalRepository {
    override fun getAllProduto(): List<ProdutoEntity> {
        TODO("Not yet implemented")
    }

    override suspend fun getProdutoById(id_produto: Long): ProdutoEntity? {
        TODO("Not yet implemented")
    }

    override suspend fun insertProduto(produtoEntity: ProdutoEntity): Long {
        TODO("Not yet implemented")
    }

    override suspend fun updateProduto(produtoEntity: ProdutoEntity) {
        TODO("Not yet implemented")
    }

    override suspend fun deleteProduto(produtoEntity: ProdutoEntity) {
        TODO("Not yet implemented")
    }

}