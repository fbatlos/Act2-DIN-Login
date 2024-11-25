package com.example.act2_din.componentes_app.componentes_login.Errors

import androidx.compose.runtime.Composable
import com.example.act2_din.componentes_app.Utils.ValidarUsuario

fun ValidacionErrores(Usuario:String,Contrasenia:String):String{
    var Error = ""
    if (Usuario.isEmpty() || Contrasenia.isEmpty()) {
        if (Usuario.isEmpty() && Contrasenia.isEmpty()) {
            Error = "todo"
        } else if (Usuario.isEmpty()) {
            Error = "usuario"
        } else {
            Error = "contraseña"
        }
    } else {

        if (ValidarUsuario(Usuario, Contrasenia)) {
            // Pop up y el cambio de pantalla
            Error = ""
        } else {
            Error = "validacionIncorecta"
        }
    }
    return Error
}