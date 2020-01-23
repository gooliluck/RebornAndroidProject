package com.gooliluck.rebornproject.fragment.listuser

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.gooliluck.rebornproject.R

class ListUsers : Fragment() {

    companion object {
        fun newInstance() = ListUsers()
    }

    private lateinit var viewModel: ListUsersViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.list_users_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(ListUsersViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
