package com.example.act2_din

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.act2_din.ui.theme.Act2DINTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Act2DINTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    AppLogIn(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}