package com.example.pruebaclasepdm.Navegation

sealed class AppScreen (val router:String){

    object loginScreen:AppScreen("loginScreen")

    object intoScreen:AppScreen("intoScreen")

}