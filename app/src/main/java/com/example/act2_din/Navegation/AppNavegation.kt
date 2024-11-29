package com.example.pruebaclasepdm.Navegation

import android.annotation.SuppressLint
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.act2_din.AppLogIn
import com.example.act2_din.SegundaScreen
import com.example.act2_din.ViewModel.LoginViewModel


@SuppressLint("RestrictedApi")
@Composable
fun AppNavegation(modifier: Modifier , loginViewModel: LoginViewModel ){
    val navContralador = rememberNavController()
//Es el encargado de iniciar cada composable segun la route
    NavHost(
        navController = navContralador,
        startDestination = AppScreen.loginScreen.router
    ){
        composable(AppScreen.loginScreen.router){
            AppLogIn(modifier,loginViewModel,navContralador)
        }

       composable(AppScreen.intoScreen.router+ "/{text}" , arguments = listOf(navArgument(name = "text"){
            type = NavType.StringType
        }))
        {
                SegundaScreen(usuarioName = it?.arguments?.getString("text") , onBack = {navContralador.popBackStack()} , modifier = modifier)
        }
    }
}

