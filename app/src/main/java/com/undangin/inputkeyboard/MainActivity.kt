package com.undangin.inputkeyboard

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var inputKeyboard : String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        inputKeyboard = ""

        button.setOnClickListener {
            inputKeyboard +="1"

            showValue(inputKeyboard)
        }
        button2.setOnClickListener {
            inputKeyboard +="2"

            showValue(inputKeyboard)
        }
        button3.setOnClickListener {
            inputKeyboard +="3"

            showValue(inputKeyboard)
        }
    }

    fun showValue(inputKeyboardDatas:String) {

        if (inputKeyboardDatas.length == 1) {
            et_1.setText(inputKeyboardDatas.substring(0,1))

        } else if (inputKeyboardDatas.length == 2) {
            et_1.setText(inputKeyboardDatas.substring(0,1))
            et_2.setText(inputKeyboardDatas.substring(1,inputKeyboardDatas.length))
            et_2.requestFocus()

        } else if (inputKeyboardDatas.length == 3) {
            et_1.setText(inputKeyboardDatas.substring(0,1))
            et_2.setText(inputKeyboardDatas.substring(1,2))
            et_3.setText(inputKeyboardDatas.substring(2,inputKeyboardDatas.length))
            et_3.requestFocus()

        } else {

        }

    }
}
