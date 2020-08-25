package com.example.secuencia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var n: Int = 1
        var cont: Int =0
        val buttons: Array<ImageButton> = arrayOf(imageButton,imageButton2,imageButton3,imageButton4,imageButton5,imageButton6,imageButton7,imageButton8,imageButton9,imageButton10,imageButton11,imageButton12,imageButton13,imageButton14,imageButton15,imageButton16,imageButton17,imageButton18,imageButton19,imageButton20,imageButton21,imageButton22,imageButton23,imageButton24,imageButton25)


        button.setOnClickListener(){
            val secuen = secuen(25)
            val secuencia : ArrayList<Int>  = secuen.secuencia(n)
            for (i:Int in 0..24) {
                buttons[i].setTag("marcado")
            }
            GlobalScope.launch(context = Dispatchers.Main) {
                delay(2000)
                    println(secuencia.count())
                    for (i: Int in 0..secuencia.count() - 1) {
                            buttons[secuencia[i]].setTag("CardBack")
                            buttons[secuencia[i]].setImageResource(R.drawable.pregunta)
                    }

            }

                for (i: Int in 0..secuencia.count() - 1) {
                        buttons[secuencia[i]].setImageResource(R.drawable.ic_launcher_foreground)
                }

        }

        for (i:Int in 0..24) {

            buttons[i].setOnClickListener {
                if (buttons[i].getTag().toString() == "CardBack"  ) {
                    buttons[i].setTag("marcado")
                    buttons[i].setImageResource(R.drawable.ic_launcher_foreground)
                    cont+=1
                }

                println("n: "+n+"y cont:"+cont)
                if(cont == n){
                    n+=1
                    println("n: "+n)
                    cont =0
                }
            }
        }



    }


}