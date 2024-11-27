package com.example.act2_din.componentes_app

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.act2_din.componentes_app.Utils.ValidarUsuario
import com.example.act2_din.componentes_app.componentes_login.BottonLogin
import com.example.act2_din.componentes_app.componentes_login.Contrasenia
import com.example.act2_din.componentes_app.componentes_login.Errors.ManagerErrors
import com.example.act2_din.componentes_app.componentes_login.Errors.ValidacionErrores
import com.example.act2_din.componentes_app.componentes_login.OtrasFormas
import com.example.act2_din.componentes_app.componentes_login.RecuperarContrasenia
import com.example.act2_din.componentes_app.componentes_login.Usuario


@Composable
fun login() {
    var Usuario by rememberSaveable  { mutableStateOf("") }
    var Contrasenia by rememberSaveable  { mutableStateOf("") }

    var Error by rememberSaveable { mutableStateOf("") }
    Box (
        modifier = Modifier
            .shadow(12.dp, shape = RoundedCornerShape(16.dp))
            .size(300.dp, 400.dp)
            .background(Color.White, shape = RoundedCornerShape(16.dp))
            .verticalScroll(rememberScrollState())
        ,
        contentAlignment = Alignment.Center

    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {

            ManagerErrors(Error)

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

            BottonLogin(
                onBotonChange = {
                    Error = ValidacionErrores(Usuario,Contrasenia)
                    if (Error.isEmpty()){

                    }else{
                        Usuario = ""
                        Contrasenia = ""
                    }
                }
            )

            RecuperarContrasenia()

            OtrasFormas(onGoogleLogin = {}, onAppleLogin = {})
        }
    }
}