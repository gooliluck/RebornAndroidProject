package com.gooliluck.rebornproject.fragment.addnewpayment

import android.app.Application
import android.os.Environment
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.gooliluck.rebornproject.fragment.base.BaseViewModel
import com.gooliluck.rebornproject.model.user.User
import com.gooliluck.rebornproject.repository.RebornRepository
import java.io.File

class AddNewPaymentViewModel(application: Application) : BaseViewModel(application) {
    var userList = MutableLiveData<MutableList<User>>()
    var userListString = MutableLiveData<MutableList<String>>()

    fun init(){
        userList.postValue(mutableListOf(
            User(
                1,
                "JpYang",
                "19860521",
                "0972617141",
                1000
            ),
            User(
                2,
                "Fiona",
                "19860521",
                "0980690662",
                1000
            ),
            User(3, "JJLIN", "19860521", "0972617142", 100)
        ))
        userListString.value = mutableListOf("JpYang","Fiona","JJLIN")
    }
}
