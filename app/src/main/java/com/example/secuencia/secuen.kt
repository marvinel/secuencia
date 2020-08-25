package com.example.secuencia

class secuen(num : Int ) {
    val  luces : ArrayList<Int> = arrayListOf<Int>()
    val a = num
    fun secuencia(n : Int): ArrayList<Int>{

        for (i:Int in 0..n-1){
            var sec = (1..a).random()
            if(luces.contains(sec)){
                while (luces.contains(sec)){
                    sec = (1..a).random()
                    println("se encuentra: "+sec)
                }
            }
            luces.add(sec)
            println(luces)
        }
        return luces
    }
}