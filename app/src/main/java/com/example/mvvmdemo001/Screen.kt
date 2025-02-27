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
        Button(onClick = binding.buttonState01.onClick) {
            Text(text = binding.buttonState01.text)
        }

        Button(onClick = binding.buttonState02.onClick) {
            Text(text = binding.buttonState02.text)
        }
    }
}

@Preview
@Composable
fun ScreenPreview(){
    Screen(
        binding = ScreenViewBinding(
            title = "Welcome to my page",

            buttonState01 = ScreenViewBinding.ButtonState(
                text = "Clicked",
                onClick = {}
            ),

            buttonState02 = ScreenViewBinding.ButtonState(
                text = "Clicked",
                onClick = {}
            ),

        )
    )
}