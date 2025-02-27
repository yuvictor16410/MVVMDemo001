package com.example.mvvmdemo001

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class ScreenViewModel : ViewModel() {

    //1.generate the Model. -> data class, ScreenViewBinding.

    private var _binding by mutableStateOf( // use mutableStateOf to update data
        ScreenViewBinding(
            title = "Welcome to my page",

            buttonState01 = ScreenViewBinding.ButtonState(
                text = "Click Me 01",
                onClick = ::onClick
            ),

            buttonState02 = ScreenViewBinding.ButtonState(
                text = "Click Me 02",
                onClick = ::onClick02
            )
        )
    )

    val binding
        get() = _binding //read only


    private fun onClick(){
        _binding = _binding.copy(
            title = "You clicked the button"
        )
    }

    private fun onClick02(){
        _binding = _binding.copy(

            buttonState01 = _binding.buttonState01.copy(
                text = "Clicked 01",
            ),

            buttonState02 = _binding.buttonState02.copy(
                text = "Clicked 02",
            ),

        )
    }

}
