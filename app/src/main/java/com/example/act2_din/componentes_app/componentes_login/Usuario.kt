package com.example.act2_din.componentes_app.componentes_login

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.act2_din.ui.theme.Dark
import com.example.act2_din.ui.theme.Gray

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Usuario(Usuario:String, onUsuarioChange: (String) -> Unit){
    OutlinedTextField(
        value = Usuario,
        onValueChange = onUsuarioChange,
        label = { Text(text = "Usuario", color = Color.Black) },
        colors = TextFieldDefaults.outlinedTextFieldColors(
            focusedBorderColor = Dark,   // Borde cuando tiene foco
            unfocusedBorderColor = Gray,  // Borde cuando no tiene foco
            cursorColor = Dark,          // Color del cursor cuando tiene foco
            focusedLabelColor = Dark,    // Color de la etiqueta cuando tiene foco
            unfocusedLabelColor = Gray,   // Color de la etiqueta cuando no tiene foco
            focusedTextColor = Dark,
            unfocusedTextColor = Gray
        ),
        modifier = Modifier
            .size(200.dp, 60.dp)
    )
    Spacer(Modifier.height(25.dp))
}