package com.example.appmercado.domain.local.repository

import com.example.appmercado.data.local.entity.VendedorEntity
import java.util.concurrent.Flow

interface VendedorLocalRepository {
    fun getAllVendedor(): List<VendedorEntity>

    suspend fun getVendedorById(id_vendedor: Long): VendedorEntity?

    suspend fun insertVendedor(vendedorEntity: VendedorEntity): Long

    suspend fun updateVendedor(vendedorEntity: VendedorEntity)

    suspend fun deleteVendedor(vendedorEntity: VendedorEntity)
}