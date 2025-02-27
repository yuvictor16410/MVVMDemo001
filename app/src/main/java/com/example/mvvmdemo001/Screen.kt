package com.example.mvvmdemo001

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

//MVVM - Screen is? ???
@Composable
fun Screen(binding: ScreenViewBinding){
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(text = binding.title)
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = binding.onClick) {
            Text(text = binding.buttonText)
        }

        Button(onClick = binding.onClick02) {
            Text(text = binding.buttonText02)
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
            buttonText = "Click Me",
            onClick02 =  {},
            buttonText02 = "Click Me",
        )
    )
}