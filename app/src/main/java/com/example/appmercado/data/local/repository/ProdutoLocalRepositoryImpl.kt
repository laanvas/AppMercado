package com.example.appmercado.data.local.repository

import com.example.appmercado.data.local.dao.ProdutoDAO
import com.example.appmercado.data.local.entity.ProdutoEntity
import com.example.appmercado.domain.local.repository.ProdutoLocalRepository
import javax.inject.Inject

class ProdutoLocalRepositoryImpl @Inject constructor(
    private val ProdutoDAO: ProdutoDAO
) : ProdutoLocalRepository {
    override fun getAllProduto(): List<ProdutoEntity> {
        return ProdutoDAO.getAllProduto()
    }

    override suspend fun getProdutoById(id_produto: Long): ProdutoEntity? {
        return ProdutoDAO.getProdutoById(id_produto)
    }

    override suspend fun getProdutoById_Vendedor(id_vendedor: Long): ProdutoEntity? {
        return ProdutoDAO.getProdutoById_Vendedor(id_vendedor)
    }

    override suspend fun insertProduto(produtoEntity: ProdutoEntity): Long {
        return ProdutoDAO.insertProduto(produtoEntity)
    }

    override suspend fun updateProduto(produtoEntity: ProdutoEntity) {
        return ProdutoDAO.updateProduto(produtoEntity)
    }

    override suspend fun deleteProduto(produtoEntity: ProdutoEntity) {
        return ProdutoDAO.deleteProduto(produtoEntity)
    }

    override suspend fun deleteProdutoById_Vendedor(id_vendedor: Long): ProdutoEntity? {
        return ProdutoDAO.deleteProdutoById_Vendedor(id_vendedor)
    }

}