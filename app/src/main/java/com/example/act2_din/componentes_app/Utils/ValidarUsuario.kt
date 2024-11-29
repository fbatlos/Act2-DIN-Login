package com.example.act2_din.componentes_app.Utils

import android.app.AlertDialog



fun ValidarUsuario(usuario:String,contrasenia:String):Boolean{
    if (usuario == "paco@gmail.com" && contrasenia == "1234567"){return true}
    else{return false}
}