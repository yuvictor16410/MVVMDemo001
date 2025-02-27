package com.example.mvvmdemo001

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels


class MainActivity : ComponentActivity() {

    private val viewModel by viewModels<ScreenViewModel>()//connects the viewmodel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Screen(binding = viewModel.binding)//connects to viewmodel to the model and the model to the view
        }
    }
}
