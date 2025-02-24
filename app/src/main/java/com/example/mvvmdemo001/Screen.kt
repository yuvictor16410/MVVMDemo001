package com.example.mvvmdemo001

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

//MVVM - Screen is? ???
@Composable
fun Screen(binding: ScreenViewBinding){
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(text = binding.title)

        Button(onClick = binding.onClick) {
            Text(text = binding.buttonText)
        }
    }
}

@Preview
@Composable
fun ScreenPreview(){
    Screen(
        binding = ScreenViewBinding(
            title = "Welcome to my page",
            onClick = {},
            buttonText = "Click Me"
        )
    )
}