package com.example.tapfrenzy.GameAPP

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.tapfrenzy.R

class LevelsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_levels)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btnN1 = findViewById<Button>(R.id.btnNivel1)

        btnN1.setOnClickListener {
            val intent = Intent(this, GameplayActivity::class.java)
            startActivity(intent)
        }

        val btnN2 = findViewById<Button>(R.id.btnNivel2)

        btnN2.setOnClickListener {
            val intent = Intent(this, GameplayActivity::class.java)
            startActivity(intent)
        }

        val btnN3 = findViewById<Button>(R.id.btnNivel3)

        btnN3.setOnClickListener {
            val intent = Intent(this, GameplayActivity::class.java)
            startActivity(intent)
        }

        val btnN4 = findViewById<Button>(R.id.btnNivel4)

        btnN4.setOnClickListener {
            val intent = Intent(this, GameplayActivity::class.java)
            startActivity(intent)
        }

        val btnN5 = findViewById<Button>(R.id.btnNivel5)

        btnN5.setOnClickListener {
            val intent = Intent(this, GameplayActivity::class.java)
            startActivity(intent)
        }

        val btnBack = findViewById<ImageButton>(R.id.btnBack)
        btnBack.setOnClickListener {
            finish()
        }
    }
}