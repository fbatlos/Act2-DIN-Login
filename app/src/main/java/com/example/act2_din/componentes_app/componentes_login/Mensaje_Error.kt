package com.example.act2_din.componentes_app.componentes_login

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import com.example.act2_din.ui.theme.FondoError
import com.example.act2_din.ui.theme.LetraError


@Composable
fun TodoVacio(

){
    Spacer(Modifier.height(15.dp))
    Box(
        modifier = Modifier
            .size(200.dp, 150.dp)
            .clip(RoundedCornerShape(16.dp))
            .background(FondoError)
        ,
        contentAlignment = Alignment.Center

    ){
        Text(
            text = "El Usuario IdEA y la\ncontraseña son campos\nrequeridos.",
            color = LetraError
        )
    }
    Spacer(Modifier.height(15.dp))
}