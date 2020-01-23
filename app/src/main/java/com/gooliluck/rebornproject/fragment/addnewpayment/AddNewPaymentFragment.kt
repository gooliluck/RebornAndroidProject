package com.gooliluck.rebornproject.fragment.addnewpayment

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.lifecycle.Observer

import com.gooliluck.rebornproject.R
import kotlinx.android.synthetic.main.add_new_payment_fragment.*

class AddNewPaymentFragment : Fragment() {

    companion object {
        fun newInstance() = AddNewPaymentFragment()
    }

    private lateinit var viewModel: AddNewPaymentViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.add_new_payment_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        viewModel = ViewModelProviders.of(this).get(AddNewPaymentViewModel::class.java)
        viewModel.userList.observe(this, Observer {
            Log.e("jptest","viewModel $viewModel")
            Log.e("jptest","viewModel ${viewModel.userList}")
            Log.e("jptest","viewModel ${viewModel.userList.value}")
            val adapter = ArrayAdapter<String>(requireContext(),android.R.layout.simple_spinner_dropdown_item,viewModel.userListString.value!!)
            val adapter2 = ArrayAdapter<String>(requireContext(),android.R.layout.simple_spinner_dropdown_item,viewModel.userListString.value!!)
//            suggest_textView.setAdapter(adapter)
//            spinner_usernames.adapter = adapter2
        })
        viewModel.init()
        addCustomer.setOnClickListener {
        }
    }

}
