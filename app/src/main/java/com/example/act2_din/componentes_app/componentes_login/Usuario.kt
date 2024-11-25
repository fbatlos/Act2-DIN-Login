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
import com.example.act2_din.ui.theme.Elementos
import com.example.act2_din.ui.theme.Gray

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Usuario(Usuario:String, onUsuarioChange: (String) -> Unit){
    OutlinedTextField(
        value = Usuario,
        onValueChange = onUsuarioChange,
        label = { Text(text = "Usuario", color = Elementos) },
        colors = TextFieldDefaults.outlinedTextFieldColors(
            focusedBorderColor = Elementos,
            unfocusedBorderColor = Gray,
            cursorColor = Elementos,
            focusedLabelColor = Elementos,
            unfocusedLabelColor = Gray,
            focusedTextColor = Elementos,
            unfocusedTextColor = Gray
        ),
        modifier = Modifier
            .size(200.dp, 60.dp)
    )
    Spacer(Modifier.height(15.dp))
}