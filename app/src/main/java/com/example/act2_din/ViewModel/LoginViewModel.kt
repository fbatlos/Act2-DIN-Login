package com.example.act2_din.ViewModel

import android.util.Patterns
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel



class LoginViewModel():ViewModel() {

    private val _email = MutableLiveData<String>()
    val email:LiveData<String> = _email

    private val _contrasenia = MutableLiveData<String>()
    val contrasenia:LiveData<String> = _contrasenia

    private val _isLoginEnable = MutableLiveData<Boolean>()
    val isLoginEnable:LiveData<Boolean> = _isLoginEnable



    fun onLoginChange(email: String,contasenia:String){
        _email.value = email
        _contrasenia.value = contasenia
        _isLoginEnable.value = loginEneable(email,contasenia)
    }

    fun loginEneable(email:String,contrasenia:String)=
        Patterns.EMAIL_ADDRESS.matcher(email).matches() && contrasenia.length > 6
}