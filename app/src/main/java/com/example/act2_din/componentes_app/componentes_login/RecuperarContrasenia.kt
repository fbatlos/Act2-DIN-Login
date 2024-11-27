package com.example.act2_din.componentes_app.componentes_login

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.example.act2_din.TextGeneral
import com.example.act2_din.ui.theme.Links


@Composable
fun RecuperarContrasenia(){
    TextGeneral(
        text = "¿Ha olvidado su contraseña?" ,
        color = Links
    )
}
