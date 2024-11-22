package com.example.act2_din.componentes_app

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.act2_din.componentes_app.componentes_login.BottonLogin
import com.example.act2_din.componentes_app.componentes_login.Contrasenia
import com.example.act2_din.componentes_app.componentes_login.Usuario


@Composable
fun login() {
    var Usuario by remember { mutableStateOf("") }
    var Contrasenia by remember { mutableStateOf("") }
    Box (
        modifier = Modifier
            .shadow(12.dp, shape = RoundedCornerShape(16.dp))
            .size(300.dp, 400.dp)
            .background(Color.White, shape = RoundedCornerShape(16.dp)),
        contentAlignment = Alignment.Center

    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {

            Usuario(Usuario){
                Usuario=it
            }

            Row(
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
            ) {

                Contrasenia(Contrasenia){
                    Contrasenia = it
                }
            }

            BottonLogin(Usuario,Contrasenia){
                Usuario = ""
                Contrasenia=""
            }
        }
    }
}