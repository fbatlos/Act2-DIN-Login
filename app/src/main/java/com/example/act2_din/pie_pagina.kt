package com.example.act2_din

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun pie_pagina(){

    Image(
        painter = painterResource(R.drawable.logos_andalucia),
        contentDescription = "Logo Ecosistema",
        modifier = Modifier.fillMaxWidth()
    )

}