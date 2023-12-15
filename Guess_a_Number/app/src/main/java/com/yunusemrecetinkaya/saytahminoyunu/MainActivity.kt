package com.yunusemrecetinkaya.saytahminoyunu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val random = (1..9).random()

        val button = findViewById<Button>(R.id.button)
        val editText = findViewById<EditText>(R.id.edit_text)
        val textView = findViewById<TextView>(R.id.text_view)

        button.setOnClickListener{
            val number : Int = Integer.parseInt(editText.text.toString())
            when{
                random > number -> textView.text = getString(R.string.buyuk)
                random < number -> textView.text = getString(R.string.kucuk)
                random == number ->{ textView.text = getString(R.string.tebriks)
                    val intent = Intent(this,SiirActivity::class.java)
                    startActivity(intent)
                }
            }


        }
    }

}