package com.example.diceroller

import android.content.Context
import android.widget.ImageView
import android.widget.Toast
import kotlin.random.Random

class MainActivityFuncs {

    //keeps track of how many times the button had been pressed
    private var counter:Int = 0

    //gives a little toast at the bottom of the screen, takes context
    fun letsGiveAToast(applicationContext:Context){
        val toastText:String = "Ye have pressed the button $counter times!"
        val toastDuration= Toast.LENGTH_SHORT
        val toast = Toast.makeText(applicationContext, toastText, toastDuration)

        //use setGravity to position the toast
        //toast.setGravity(Gravity.LEFT, 0, -200)
        toast.show()
    }

    //generates and returns a random value from 1 to 6
    private fun generateRandomBetweenOneAndSix(): Int{
        val rand = Random.nextInt(1, 6 + 1)
        println(rand)
        return rand
    }

    //changes the text of our textView
    fun changeDiceImageViewImage(diceImageView: ImageView){
        //inc counter
        counter++

        //switch case equiv of kotlin.
        val imageResource = when (generateRandomBetweenOneAndSix()){

            //sets the image resources from drawable based on output from random func
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }


        diceImageView.setImageResource(imageResource)

    }
}