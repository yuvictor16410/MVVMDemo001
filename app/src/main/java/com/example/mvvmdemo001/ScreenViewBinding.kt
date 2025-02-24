package com.example.mvvmdemo001

data class ScreenViewBinding(
    val title: String,
    val onClick: ()-> Unit,
    val buttonText: String
)
