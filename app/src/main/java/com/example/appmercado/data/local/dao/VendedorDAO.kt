package com.example.appmercado.data.local.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.example.appmercado.data.local.entity.ProdutoEntity
import com.example.appmercado.data.local.entity.VendedorEntity
import java.util.concurrent.Flow

@Dao
interface VendedorDAO {

    @Query("SELECT * FROM Vendedor")
    fun getAllVendedor(): Flow<List<VendedorEntity>>

    @Query("SELECT * FROM Vendedor WHERE id_vendedor = :id_vendedor")
    fun getVendedorById(id_vendedor: Long): ProdutoEntity?

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insertVendedor(produtoEntity: ProdutoEntity): Long

    @Update
    fun updateVendedor(produtoEntity: ProdutoEntity)

    @Delete
    fun deleteVendedor(produtoEntity: ProdutoEntity)
}