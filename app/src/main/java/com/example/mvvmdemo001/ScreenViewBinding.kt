package com.example.mvvmdemo001

import android.widget.Button

//Model -> data of the view
data class ScreenViewBinding(
    val title: String,
    val buttonState01: ButtonState,
    val buttonState02: ButtonState
){
    data class ButtonState(
        val text: String,
        val onClick: () -> Unit
    )
}
