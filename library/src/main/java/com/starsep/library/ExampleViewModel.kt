package com.starsep.library

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ExampleViewModel : ViewModel() {
    private val _someList: MutableLiveData<List<Int>> = MutableLiveData(listOf(1, 2, 3))
    val someList: LiveData<List<Int>> = _someList
}