package com.gooliluck.rebornproject.model.order

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.gooliluck.rebornproject.model.product.Product
import com.gooliluck.rebornproject.model.user.User
import java.util.*

const val TABLE_ORDER = "orders"
@Entity(tableName = TABLE_ORDER)
data class Order(
    @PrimaryKey val id : Int,
    val userId : Int,
    val barberId : Long,
    val service : String?,
    val serviceMoney : Int?,
    val product : Int?,
    val totalPaidMoney : Int?,
    val orderDesc : String?,
    val companyMoney : Int?,
    val barberMoney : Int?,
    val orderTime : Long?
){
    override fun toString(): String {
        return "Order(" +
                "id:$id," +
                "userId:$userId," +
                "barberId:$barberId," +
                "service:$service," +
                "serviceMoney:$serviceMoney)"
    }
}