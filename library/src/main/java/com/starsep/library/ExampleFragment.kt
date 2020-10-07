package com.starsep.library

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels

class ExampleFragment : Fragment() {
    private val exampleViewModel: ExampleViewModel by viewModels()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        exampleViewModel.someList.observe(viewLifecycleOwner) { someList ->
            val something = someList.filterNot { it % 2 == 1 }
            val s = getString(R.string.libraryStringTemplate, something.size)
        }
    }
}