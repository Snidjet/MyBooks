package com.example.android.mybooks.view.ui

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.android.mybooks.R
import com.example.android.mybooks.viewmodel.AddToListViewModel

class addToListFragment : Fragment() {

    companion object {
        fun newInstance() = addToListFragment()
    }

    private lateinit var viewModel: AddToListViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.add_to_list_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(AddToListViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
