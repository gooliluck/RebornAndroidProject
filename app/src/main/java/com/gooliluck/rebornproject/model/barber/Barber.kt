package com.gooliluck.rebornproject.model.barber

import androidx.room.Entity
import androidx.room.PrimaryKey

const val TABLE_BARBER = "barbers"
@Entity(tableName = TABLE_BARBER)
class Barber (
    @PrimaryKey var id : Int,
    var name : String,
    var permissionLevel : Int
)