package com.undangin.inputkeyboard

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var inputKeyboard : String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        inputKeyboard = ""

        button.setOnClickListener {
            if (inputKeyboard.length < 3) {
                inputKeyboard += "1"
                showValue(inputKeyboard)
            }
        }

        button2.setOnClickListener {
            if (inputKeyboard.length < 3) {
                inputKeyboard += "2"
                showValue(inputKeyboard)
            }
        }

        button3.setOnClickListener {
            if (inputKeyboard.length < 3) {
                inputKeyboard += "3"
                showValue(inputKeyboard)
            }
        }

        button4.setOnClickListener {
            if (inputKeyboard.length < 3) {
                inputKeyboard += "5"
                showValue(inputKeyboard)
            }
        }

        button5.setOnClickListener {
            if (inputKeyboard.length < 3) {
                inputKeyboard += "4"
                showValue(inputKeyboard)
            }
        }

        button6.setOnClickListener {
            if (inputKeyboard.length > 0) {

                delValue(inputKeyboard)
            }
        }
    }

    fun showValue(inputKeyboardDatas:String) {
        if (inputKeyboardDatas.length == 1) {
            et_1.setText(inputKeyboardDatas.substring(0,1))
            et_2.requestFocus()

        } else if (inputKeyboardDatas.length == 2) {
            et_2.setText(inputKeyboardDatas.substring(1,inputKeyboardDatas.length))
            et_3.requestFocus()

        } else if (inputKeyboardDatas.length == 3) {
            et_3.setText(inputKeyboardDatas.substring(2,inputKeyboardDatas.length))

        }

    }

    fun delValue(inputKeyboardDatas:String) {
        if (inputKeyboardDatas.length == 1) {
            et_1.setText("")

        } else if (inputKeyboardDatas.length == 2) {
            et_2.setText("")
            et_1.requestFocus()

        } else if (inputKeyboardDatas.length == 3) {
            et_3.setText("")
            et_2.requestFocus()

        }

        inputKeyboard = inputKeyboard.substring(0, inputKeyboard.length - 1)

    }
}
