package com.example.ud06_3_guessgame;

import androidx.lifecycle.ViewModel
class GameViewModel :ViewModel(){
    val words = listOf<String>("pocho","caramelo","limon","autentico","mrfektous","eduardoVehicle","chusto")
    var secretWord = words.random().uppercase()


}

