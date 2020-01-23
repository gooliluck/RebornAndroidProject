package com.gooliluck.rebornproject.database

import android.database.Observable
import androidx.lifecycle.LiveData
import androidx.room.*
import com.gooliluck.rebornproject.model.barber.Barber
import com.gooliluck.rebornproject.model.barber.TABLE_BARBER
import com.gooliluck.rebornproject.model.order.Order
import com.gooliluck.rebornproject.model.order.TABLE_ORDER
import com.gooliluck.rebornproject.model.product.Product
import com.gooliluck.rebornproject.model.product.TABLE_PRODUCT
import com.gooliluck.rebornproject.model.user.TABLE_USER
import com.gooliluck.rebornproject.model.user.User

@Dao
interface RebornDao {
    @Query("select * from $TABLE_USER")
    fun getAllUsers(): List<User>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun updateUser(user: User)

    @Update(onConflict = OnConflictStrategy.IGNORE)
    fun insertUser(user : User)

    @Query("SELECT * FROM $TABLE_USER WHERE 'id' = :id")
    fun getUserById(id: Int): LiveData<User>

    @Delete
    fun deleteUser(user: User)

    @Query("select * from $TABLE_PRODUCT")
    fun getAllProduct(): List<Product>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun updateProduct(product: Product)

    @Update(onConflict = OnConflictStrategy.IGNORE)
    fun insertProduct(product : Product)

    @Delete
    fun deleteProduct(product: Product)


    @Query("select * from $TABLE_ORDER")
    fun getAllOrder(): List<Order>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun updateOrder(order: Order)

    @Update(onConflict = OnConflictStrategy.IGNORE)
    fun insertOrder(product : Order)

    @Delete
    fun deleteOrder(product: Order)


    @Query("select * from $TABLE_BARBER")
    fun getAllBarber(): List<Barber>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun updateBarber(product: Barber)

    @Update(onConflict = OnConflictStrategy.IGNORE)
    fun insertBarber(product : Barber)

    @Delete
    fun deleteBarber(product: Barber)
}


