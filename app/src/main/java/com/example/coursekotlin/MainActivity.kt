package com.example.coursekotlin

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import net.objecthunter.exp4j.Expression
import net.objecthunter.exp4j.ExpressionBuilder

class MainActivity : AppCompatActivity() {
    lateinit var window: TextView

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
        }
    }

    fun clean(view: View) {
        window.text = ""
    }

    fun resolve(view: View) {
        try {
            window.text = ExpressionBuilder(window.text.toString()).build().evaluate().toString()
        }catch(error: Exception){
            window.text = error.message
        }
    }
}