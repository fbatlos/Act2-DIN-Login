package com.example.act2_din

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.act2_din.ui.theme.Fondo

@Composable
fun SegundaScreen(
    usuarioName:String?,
    modifier: Modifier,
    onBack:() ->Unit
){

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Fondo),
        contentAlignment = Alignment.Center
    ){
        if(usuarioName == null){onBack}
        Column (
            verticalArrangement = Arrangement.Center
        ){
            TextGeneral("Bienvenido : $usuarioName ", Color.Black)

            Button(
                onClick = {onBack}
            ){
                TextGeneral("Volver" , Color.Black)
            }
        }

    }

}