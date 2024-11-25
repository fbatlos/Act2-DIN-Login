package com.example.act2_din.componentes_app.componentes_login.Errors

import androidx.compose.runtime.Composable


@Composable
fun ManagerErrors(Error:String){
    when(Error){
        "todo" -> Mensaje_Error("El Usuario IdEA y la\ncontraseña son campos\nrequeridos.")
        "usuario" -> Mensaje_Error("El Usuario IdEA no\n es correcto o está vacío")
        "contraseña" -> Mensaje_Error("La Contraseña no\n es correcta o está vacia")
        "validacionIncorecta" -> Mensaje_Error("El Usuario IdEA y la\ncontraseña son \nincorrectos.")
        else -> true
    }
}