package com.gooliluck.rebornproject.model.user

import androidx.room.Entity
import androidx.room.PrimaryKey

const val TABLE_USER = "users"
@Entity (tableName = TABLE_USER)
data class User(@PrimaryKey val id: Int,
                val name : String,
                val birthday : String?,
                val phoneNumber : String?,
                val advancePayment : Int
)

