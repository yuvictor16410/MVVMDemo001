package com.example.mvvmdemo001

//Model -> data of the view
data class ScreenViewBinding(
    val title: String,
    val onClick: ()-> Unit,
    val buttonText: String,
    val onClick02: ()-> Unit,
    val buttonText02: String
)
