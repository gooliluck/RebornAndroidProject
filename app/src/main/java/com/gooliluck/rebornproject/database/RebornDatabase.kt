package com.gooliluck.rebornproject.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.gooliluck.rebornproject.model.barber.Barber
import com.gooliluck.rebornproject.model.order.Order
import com.gooliluck.rebornproject.model.product.Product
import com.gooliluck.rebornproject.model.user.User

@Database(entities = [User::class,Product::class,Order::class,Barber::class], version = 1)
abstract class RebornDatabase : RoomDatabase(){
    public abstract val rebornDao: RebornDao

    companion object {
        private var INSTANCE: RebornDatabase? = null

        fun getInstance(context: Context) = INSTANCE ?:
        Room.databaseBuilder(context, RebornDatabase::class.java, "RebornDatabase")
            // .allowMainThreadQueries() don't use, need to in work thread
            .build().also { INSTANCE = it }
    }
}


