package com.example.basecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    lateinit var mEtFirstNum:EditText
    lateinit var mEtSecondNum:EditText
    lateinit var mTxtResult:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mEtFirstNum =findViewById(R.id.et_fNum)
        mEtSecondNum =findViewById(R.id.et_sNum)
        mTxtResult= findViewById(R.id.txt_result)



    }

    fun sum(view:View){
        if (mEtFirstNum.text.toString().isEmpty()||mEtSecondNum.text.toString().isEmpty()){
            Toast.makeText(this, "Please Enter Number", Toast.LENGTH_LONG).show()
        }else{
            var num1 = mEtFirstNum.text.toString().toInt()
            var num2 = mEtSecondNum.text.toString().toInt()
            var sum = num1+num2
            mTxtResult.text= sum.toString()
        }
    }

    fun multi(view:View){
        if (mEtFirstNum.text.toString().isEmpty()||mEtSecondNum.text.toString().isEmpty()){
            Toast.makeText(this, "Please Enter Number", Toast.LENGTH_LONG).show()
        }else{
            var num1 = mEtFirstNum.text.toString().toInt()
            var num2 = mEtSecondNum.text.toString().toInt()
            var multi = num1*num2
            mTxtResult.text= multi.toString()
        }
    }

    fun clear(view:View){
        mEtFirstNum.setText("")
        mEtSecondNum.setText("")
    }

}