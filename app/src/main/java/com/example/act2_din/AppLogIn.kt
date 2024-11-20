package com.example.act2_din

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.act2_din.ui.theme.Fondo


@Composable
fun AppLogIn(modifier: Modifier) {

    Column (
        modifier = modifier
            .fillMaxSize()
            .background(Fondo)
    ){
        Spacer(Modifier.size(10.dp))

        encabezado()

        Spacer(Modifier.size(10.dp))

        log_In()

        Spacer(Modifier.size(10.dp))

        pie_pagina()

    }
}
