package com.example.appmercado.data.local.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "Produto")
data class ProdutoEntity(

    @PrimaryKey(autoGenerate = true)
    val id_produto: Long = 0,

    @ColumnInfo("nome_produto")
    val nome_produto: String?,

    @ColumnInfo("categoria_produto")
    val categoria_produto: String?,

    @ColumnInfo("desc_produto")
    val desc_produto: String?,

    @ColumnInfo("preco_produto")
    val preco_produto: Int?,

    @ColumnInfo("id_vendedor")
    val id_vendedor: Int

)