package com.example.appmercado.data.local.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.example.appmercado.data.local.entity.VendedorEntity

@Dao
interface VendedorDAO {

    @Query("SELECT * FROM Vendedor")
    fun getAllVendedor(): List<VendedorEntity>

    @Query("SELECT * FROM Vendedor WHERE id_vendedor = :id_vendedor")
    fun getVendedorById(id_vendedor: Long): VendedorEntity?

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insertVendedor(vendedorEntity: VendedorEntity): Long

    @Update
    fun updateVendedor(vendedorEntity: VendedorEntity)

    @Delete
    fun deleteVendedor(vendedorEntity: VendedorEntity)
}