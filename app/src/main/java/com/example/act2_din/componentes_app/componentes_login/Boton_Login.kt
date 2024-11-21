package com.example.act2_din.componentes_app.componentes_login

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import com.example.act2_din.ui.theme.Dark
import com.example.act2_din.ui.theme.Fondo
import com.example.act2_din.ui.theme.Gray


@Composable
fun BottonLogin(Usuario: String,Contrasenia: String,onBotonChange:(String) -> Unit){
    Spacer(Modifier.height(25.dp))
    Button(
        onClick = {
            onBotonChange(Usuario)
            onBotonChange(Contrasenia)
        },
        colors = ButtonDefaults.buttonColors(
            containerColor = Dark,    // Color de fondo de nuestro boton
            contentColor = Fondo, // Color del texto
            disabledContainerColor = Gray
        )
    ) {
        Text(" Login ", fontFamily = FontFamily.SansSerif , color = Fondo)
    }
}