package com.example.act2_din

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import com.example.act2_din.ui.theme.DartGray
import com.example.act2_din.ui.theme.Gray

@Preview(name = "encabezado")
@Composable
fun encabezado( ) {


        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxWidth()
        ){
            Image(
                painter = painterResource(R.drawable.logo_ecosistema),
                contentDescription = "Logo Ecosistema",
                modifier = Modifier.size(60.dp)
            )
            Column (
                modifier = Modifier.padding(start = 6.dp)
            ){
                Text("Ecosistema Digital educativo", fontWeight = FontWeight.Bold, fontSize = 4.em , color = DartGray)
                Text("de Andalucía", fontSize = 3.em , fontFamily = FontFamily.SansSerif , color = Gray )
                Text("Servicio de Atentificación Certificado.", fontSize = 3.em , fontFamily = FontFamily.SansSerif , color = Gray)
            }

        }

}
