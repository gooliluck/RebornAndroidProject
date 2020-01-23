package com.gooliluck.rebornproject.fragment.base

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel
import com.gooliluck.rebornproject.repository.RebornRepository

open class BaseViewModel(application: Application) : AndroidViewModel(application) {
    val RebornRepo = RebornRepository.getInstance(application)
}