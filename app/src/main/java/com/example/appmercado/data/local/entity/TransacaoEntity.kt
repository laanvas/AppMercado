package com.example.appmercado.data.local.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import java.util.Date

@Entity(
    tableName = "Transacoes",
    foreignKeys = [
        ForeignKey(
            entity = ClienteEntity::class,
            parentColumns = ["id_cliente"],
            childColumns = ["id_cliente"],
            onDelete = ForeignKey.CASCADE
        ),
        ForeignKey(
            entity = VendedorEntity::class,
            parentColumns = ["id_vendedor"],
            childColumns = ["id_vendedor"],
            onDelete = ForeignKey.CASCADE
        )
    ]
)
data class TransacaoEntity(
    @PrimaryKey(autoGenerate = true)
    val id_transacao: Long = 0,

    @ColumnInfo("preco_transacao")
    val preco_transacao: Double?,

    @ColumnInfo("id_cliente")
    val id_cliente: Int?,

    @ColumnInfo("id_vendedor")
    val id_vendedor: String?,

    @ColumnInfo("datanas_cliente")
    val data_transacao: Date?,
)



