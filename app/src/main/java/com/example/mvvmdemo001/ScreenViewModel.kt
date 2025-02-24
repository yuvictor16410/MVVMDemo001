package com.example.mvvmdemo001

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class ScreenViewModel : ViewModel() {

    //1.generate the Model. -> data class, ScreenViewBinding.

    private var _binding by mutableStateOf(
        ScreenViewBinding(
            title = "Welcome to my page",
            onClick = ::onClick,
            buttonText = "Click Me"
        )
    )

    val binding
        get() = _binding //read only


    private fun onClick(){
        _binding = _binding.copy(
            title = "You clicked the button"
        )
    }

}
