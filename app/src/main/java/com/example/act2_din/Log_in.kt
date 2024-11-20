package com.example.act2_din

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.act2_din.ui.theme.Dark

@Composable
fun log_In(usuario:String , onUsuarioCambia:()->Unit , ){

    Box (
        Modifier
            .fillMaxWidth(),
        contentAlignment = Alignment.Center
    ){
        Box(
            modifier = Modifier
                .shadow(
                    elevation = 10.dp,
                    spotColor = Color.Black,
                    shape = RoundedCornerShape(8.dp)
                )
                .background(Color.White)
                .size(300.dp, 500.dp),
            contentAlignment = Alignment.Center
        ) {

            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                TextField(
                    value = usuario,
                    onValueChange = {onUsuarioCambia},


                )

            }
        }
    }
}