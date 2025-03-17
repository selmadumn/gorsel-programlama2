package com.example.hazir_cevaplar

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var inputQuestion: EditText
    private lateinit var btnGetAnswer: Button
    private lateinit var textViewAnswer: TextView

    private val answers = mapOf(
        "Merhaba" to "Merhaba! Size nasıl yardımcı olabilirim?",
        "Nasılsın?" to "İyiyim, teşekkürler! Siz nasılsınız?",
        "Hoşça kal" to "Hoşça kal! Görüşürüz."
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        inputQuestion = findViewById(R.id.inputQuestion)
        btnGetAnswer = findViewById(R.id.btnGetAnswer)
        textViewAnswer = findViewById(R.id.textViewAnswer)

        btnGetAnswer.setOnClickListener { getAnswer() }
    }

    private fun getAnswer() {
        val question = inputQuestion.text.toString()
        val answer = answers[question]
        textViewAnswer.text = answer ?: "Cevap bulunamadı."
    }
}

