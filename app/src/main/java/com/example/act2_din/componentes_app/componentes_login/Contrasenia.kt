package com.example.act2_din.componentes_app.componentes_login

import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import com.example.act2_din.ui.theme.Dark
import com.example.act2_din.ui.theme.Gray


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Contrasenia(contrasenia: String, onContraseniaChange: (String) -> Unit){
    var active by remember { mutableStateOf(false) }

    OutlinedTextField(
        value = contrasenia,
        onValueChange = onContraseniaChange,
        colors = TextFieldDefaults.outlinedTextFieldColors(
            focusedBorderColor = Dark,   // Borde cuando tiene foco
            unfocusedBorderColor = Gray,  // Borde cuando no tiene foco
            cursorColor = Dark,          // Color del cursor cuando tiene foco
            focusedLabelColor = Dark,    // Color de la etiqueta cuando tiene foco
            unfocusedLabelColor = Gray, // Color de la etiqueta cuando no tiene foco
            focusedTextColor = Dark,
            unfocusedTextColor = Gray
        ),
        label = { Text(text = "Contraseña" , color = Color.Black) },
        trailingIcon = {
            if (contrasenia.isNotEmpty()) {
                IconButton(onClick = { active=!active }) {
                    Icon(if (active) Icons.Filled.Visibility else Icons.Filled.VisibilityOff, contentDescription = "Ver texto" , tint = Gray)
                }
            }
        },
        modifier = Modifier
            .size(200.dp, 60.dp),

        visualTransformation = if (!active) PasswordVisualTransformation() else VisualTransformation.None

    )
}