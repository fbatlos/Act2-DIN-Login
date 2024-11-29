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
import com.example.act2_din.TextGeneral
import com.example.act2_din.ui.theme.Dark
import com.example.act2_din.ui.theme.Elementos
import com.example.act2_din.ui.theme.Gray


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Contrasenia(contrasenia: String, onContraseniaChange: (String) -> Unit){
    var active by remember { mutableStateOf(false) }

    OutlinedTextField(
        value = contrasenia,
        onValueChange = onContraseniaChange,
        singleLine = true,
        colors = TextFieldDefaults.outlinedTextFieldColors(
            focusedBorderColor = Elementos,
            unfocusedBorderColor = Gray,
            cursorColor = Elementos,
            focusedLabelColor = Elementos,
            unfocusedLabelColor = Gray,
            focusedTextColor = Elementos,
            unfocusedTextColor = Gray
        ),
        label = {
            TextGeneral(
                text = "Contraseña" ,
                color = Elementos
            )},

        trailingIcon = {
            if (contrasenia.isNotEmpty()) {
                IconButton(onClick = { active=!active }) {
                    Icon(if (active) Icons.Filled.Visibility else Icons.Filled.VisibilityOff, contentDescription = "Ver texto" , tint = Elementos)
                }
            }
        },
        modifier = Modifier
            .size(200.dp, 70.dp),

        visualTransformation = if (!active) PasswordVisualTransformation() else VisualTransformation.None

    )
}