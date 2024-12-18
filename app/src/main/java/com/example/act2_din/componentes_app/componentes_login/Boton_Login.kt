package com.example.act2_din.componentes_app.componentes_login

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import com.example.act2_din.TextGeneral
import com.example.act2_din.ui.theme.ColorBoton
import com.example.act2_din.ui.theme.Dark
import com.example.act2_din.ui.theme.Fondo
import com.example.act2_din.ui.theme.Gray


@Composable
fun BottonLogin(onBotonChange:() -> Unit , enable:Boolean){
    Spacer(Modifier.height(15.dp))

    Button(
        modifier = Modifier
            .fillMaxWidth(0.7f)
            .height(50.dp),

        onClick = {
            onBotonChange()
        },

        colors = ButtonDefaults.buttonColors(
            containerColor = ColorBoton,    // Color de fondo de nuestro boton
            contentColor = Color.White, // Color del texto
            disabledContainerColor = Gray
        ),

        shape =  RoundedCornerShape(10.dp),
        enabled = enable
    ) {
        TextGeneral(
            text = "Iniciar Sesión",
            color = Fondo
        )
    }
}