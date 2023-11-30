package com.example.appmercado.data.local.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.example.appmercado.data.local.entity.ProdutoEntity
import java.util.concurrent.Flow

@Dao
interface ProdutoDAO {

    @Query("SELECT * FROM Produto")
    fun getAllProduto(): List<ProdutoEntity>

    @Query("SELECT * FROM Produto WHERE id_produto = :id_produto")
    fun getProdutoById(id_produto: Long): ProdutoEntity?

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insertProduto(produtoEntity: ProdutoEntity): Long

    @Update
    fun updateProduto(produtoEntity: ProdutoEntity)

    @Delete
    fun deleteProduto(produtoEntity: ProdutoEntity)

}