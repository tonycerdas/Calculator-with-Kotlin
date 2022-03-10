package com.example.coursekotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var window: TextView
    var numberValue = ""
    var index: Int = 1
    val arrayList = ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initComponents()
    }

    fun initComponents() {
        window = findViewById<TextView>(R.id.window)
    }

    fun display(view: View) {
        if (view is Button) {
            window.text = window.text.toString() + view.text.toString()
            /*if (view.text.toString() != "+" &&
                view.text.toString() != "-" &&
                view.text.toString() != "*" &&
                view.text.toString() != "/"
            ) {
                numberValue += view.text.toString()
                arrayList[index] = numberValue

            } else {
                increaseIndex(true)
                numberValue = view.text.toString()
                arrayList[index] = numberValue
                numberValue = ""
                increaseIndex(true)
            }*/
        }
    }

    fun clean(view: View) {
        window.text = ""
    }

    fun resolve(view: View) {
        window.text = "resolver"
    }

    fun increaseIndex(value: Boolean) {
        if (value) index++
    }
}