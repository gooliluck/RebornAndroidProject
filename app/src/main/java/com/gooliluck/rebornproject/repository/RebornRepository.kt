package com.gooliluck.rebornproject.repository

import android.app.Application
import android.content.Context
import androidx.room.Room
import com.gooliluck.rebornproject.database.RebornDatabase

class RebornRepository(application: Application) {
    companion object {
        private var INSTANCE: RebornRepository? = null

        fun getInstance(application: Application) = INSTANCE ?:
        RebornRepository(application).also { INSTANCE = it }
    }


}