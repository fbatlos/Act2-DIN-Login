package com.example.act2_din

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.navigation.NavHostController
import com.example.act2_din.ViewModel.LoginViewModel
import com.example.act2_din.componentes_app.encabezado
import com.example.act2_din.componentes_app.login
import com.example.act2_din.componentes_app.pie_pagina
import com.example.act2_din.ui.theme.Fondo


@Composable
fun AppLogIn(modifier: Modifier, viewModel: LoginViewModel, navContralador: NavHostController) {

    Column (
        modifier = modifier
            .fillMaxSize()
            .background(Fondo),
        horizontalAlignment = Alignment.CenterHorizontally
    ){

        Box (
            modifier = Modifier.weight(1f),
            contentAlignment = Alignment.Center
        ){
            encabezado()
        }


        Box (
            modifier = Modifier.weight(3f)

        ){
            login(viewModel,navContralador)
        }

        Box(
            modifier = Modifier.weight(1f)
        ) {
            pie_pagina()
        }
    }
}

@Composable
fun TextGeneral(text:String,color:Color){
    Text(
        text =text,
        fontFamily = FontFamily.SansSerif ,
        color = color
    )
}