package com.example.act2_din.componentes_app

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.act2_din.R

@Preview
@Composable
fun pie_pagina(){

    Image(
        painter = painterResource(R.drawable.logos_andalucia),
        contentDescription = "Logo Ecosistema",
        modifier = Modifier.fillMaxWidth()
    )

}