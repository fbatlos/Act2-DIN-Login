package com.example.act2_din.componentes_app.Utils

import android.app.AlertDialog



fun ValidarUsuario(usuario:String,contrasenia:String):Boolean{
    if (usuario == "paco" && contrasenia == "1234"){return true}
    else{return false}
}