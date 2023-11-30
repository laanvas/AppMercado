package com.example.appmercado.data.local.repository

import com.example.appmercado.data.local.dao.VendedorDAO
import com.example.appmercado.data.local.entity.VendedorEntity
import com.example.appmercado.domain.local.repository.VendedorLocalRepository
import javax.inject.Inject


class VendedorLocalRepositoryImpl @Inject constructor(
    private val VendedorDAO: VendedorDAO
): VendedorLocalRepository {
    override fun getAllVendedor(): List<VendedorEntity> {
        TODO("Not yet implemented")
    }

    override suspend fun getVendedorById(id_vendedor: Long): VendedorEntity? {
        TODO("Not yet implemented")
    }

    override suspend fun insertVendedor(vendedorEntity: VendedorEntity): Long {
        TODO("Not yet implemented")
    }

    override suspend fun updateVendedor(vendedorEntity: VendedorEntity) {
        TODO("Not yet implemented")
    }

    override suspend fun deleteVendedor(vendedorEntity: VendedorEntity) {
        TODO("Not yet implemented")
    }


}