package com.gooliluck.rebornproject.model.product

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

const val TABLE_PRODUCT = "products"
@Entity(tableName = TABLE_PRODUCT)
data class Product(@PrimaryKey val productId: Long, val productCost: Int, val name: String)