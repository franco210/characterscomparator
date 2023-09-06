package com.example.contador

class Comparador(var text1: String,var text2: String, var valor: Boolean) {

    fun comp() : String{
        if(text1==text2){
            return " ${text1.toString()} y ${text2.toString()} son iguales "
        }else{
          return " ${text1.toString()} y ${text2.toString()} son distintos "
        }
    }
}