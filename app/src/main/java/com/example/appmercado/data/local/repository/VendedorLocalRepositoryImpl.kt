package com.example.appmercado.data.local.repository

import com.example.appmercado.data.local.dao.VendedorDAO
import com.example.appmercado.data.local.entity.VendedorEntity
import com.example.appmercado.domain.local.repository.VendedorLocalRepository
import javax.inject.Inject


class VendedorLocalRepositoryImpl @Inject constructor(
    private val VendedorDAO: VendedorDAO
): VendedorLocalRepository {
    override fun getAllVendedor(): List<VendedorEntity> {
        return VendedorDAO.getAllVendedor()
    }

    override suspend fun getVendedorById(id_vendedor: Long): VendedorEntity? {
        return VendedorDAO.getVendedorById(id_vendedor)
    }

    override suspend fun insertVendedor(vendedorEntity: VendedorEntity): Long {
        return VendedorDAO.insertVendedor(vendedorEntity)
    }

    override suspend fun updateVendedor(vendedorEntity: VendedorEntity) {
        return VendedorDAO.updateVendedor(vendedorEntity)
    }

    override suspend fun deleteVendedor(vendedorEntity: VendedorEntity) {
        return VendedorDAO.deleteVendedor(vendedorEntity)
    }


}