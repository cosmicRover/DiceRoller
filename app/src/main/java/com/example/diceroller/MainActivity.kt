package com.example.diceroller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    private val mainActFuncs = MainActivityFuncs()
    private lateinit var diceImageView:ImageView
    private lateinit var rollButton:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //inits
        diceImageView = findViewById(R.id.main_dice_imageView)
        rollButton = findViewById<Button>(R.id.main_roll_button)

        //setups
        setupDiceRollButton()
    }

    private fun setupDiceRollButton(){
        //sets new text for the button
        rollButton.text = "Roll it fam!"

        //sets a target/onClick() method for our button
        rollButton.setOnClickListener {
            mainActFuncs.changeDiceImageViewImage(diceImageView)
            mainActFuncs.letsGiveAToast(applicationContext)
        }
    }
}
