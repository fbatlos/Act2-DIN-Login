package com.example.act2_din.componentes_app.componentes_login

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import com.example.act2_din.ui.theme.ColorBoton
import com.example.act2_din.ui.theme.Dark
import com.example.act2_din.ui.theme.Fondo
import com.example.act2_din.ui.theme.Gray


@Composable
fun BottonLogin(onBotonChange:() -> Unit){
    Spacer(Modifier.height(15.dp))
    Button(
        onClick = {
            onBotonChange()
        },
        colors = ButtonDefaults.buttonColors(
            containerColor = ColorBoton,    // Color de fondo de nuestro boton
            contentColor = Color.White, // Color del texto
            disabledContainerColor = Gray
        )
    ) {
        Text(
            text = "Iniciar Sesión",
            fontFamily = FontFamily.SansSerif ,
            color = Fondo
        )
    }
}