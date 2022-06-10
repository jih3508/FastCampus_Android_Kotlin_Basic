package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Homework_1_me : AppCompatActivity() {

    private var result : Int? = 0;

    private var storeValue : Int? = 0;

    lateinit var one : TextView
    lateinit var two : TextView
    lateinit var three : TextView
    lateinit var four : TextView
    lateinit var five : TextView
    lateinit var six : TextView
    lateinit var seven : TextView
    lateinit var eight : TextView
    lateinit var nine : TextView
    lateinit var zero : TextView

    lateinit var ca : TextView
    lateinit var plus : TextView
    lateinit var equal : TextView
    lateinit var showText : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homewrk1_me)

        showText = findViewById(R.id.showText)

        one = findViewById(R.id.one)
        two = findViewById(R.id.two)
        three = findViewById(R.id.three)
        four = findViewById(R.id.four)
        five = findViewById(R.id.five)
        six = findViewById(R.id.six)
        seven = findViewById(R.id.seven)
        eight = findViewById(R.id.eight)
        nine = findViewById(R.id.nine)
        zero = findViewById(R.id.zero)

        ca = findViewById(R.id.cancle)
        plus = findViewById(R.id.plus)
        equal = findViewById(R.id.equal)

        one.setOnClickListener {
            if(showText.text.toString().equals("0")) showText.setText("")
            showText.setText(showText.text.toString() + "1")
        }

        two.setOnClickListener {
            if(showText.text.toString().equals("0")) showText.setText("")
            showText.setText(showText.text.toString() + "2")
        }

        three.setOnClickListener {
            if(showText.text.toString().equals("0")) showText.setText("")
            showText.setText(showText.text.toString() + "3")
        }

        four.setOnClickListener {
            if(showText.text.toString().equals("0")) showText.setText("")
            showText.setText(showText.text.toString() + "4")
        }

        five.setOnClickListener {
            if(showText.text.toString().equals("0")) showText.setText("")
            showText.setText(showText.text.toString() + "5")
        }

        six.setOnClickListener {
            if(showText.text.toString().equals("0")) showText.setText("")
            showText.setText(showText.text.toString() + "6")
        }

        seven.setOnClickListener {
            if(showText.text.toString().equals("0")) showText.setText("")
            showText.setText(showText.text.toString() + "7")
        }

        eight.setOnClickListener {
            if(showText.text.toString().equals("0")) showText.setText("")
            showText.setText(showText.text.toString() + "1")
        }

        nine.setOnClickListener {
            if(showText.text.toString().equals("0")) showText.setText("")
            showText.setText(showText.text.toString() + "9")
        }

        zero.setOnClickListener {
            if(showText.text.toString().equals("0")) showText.setText("")
            showText.setText(showText.text.toString() + "0")
        }

        plus.setOnClickListener{
            this.storeValue = showText.text.toString().toInt()
            this.result = this.result?.plus(storeValue!!)
            this.storeValue = 0

            showText.setText("0")
        }

        ca.setOnClickListener{
            showText.setText("0")
            this.result = 0
        }

        equal.setOnClickListener{
            this.storeValue = showText.text.toString().toInt()
            this.result = this.result?.plus(storeValue!!)
            this.storeValue = 0
            showText.setText(result.toString())
        }

    }

    fun setNumberTextViewListner(){
        val numberTextViewList: List<TextView> = listOf(
            one, two, three, four, five, six, seven, eight, nine, zero
        )

        numberTextViewList.forEach(){
            it.setOnClickListener{
                if(showText.text.toString().equals("0")) showText.setText("")
                showText.setText(showText.text.toString() + (it as TextView).text.toString())
            }
        }
    }

}