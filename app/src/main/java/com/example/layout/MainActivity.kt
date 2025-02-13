package com.example.layout

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        var button=findViewById<Button>(R.id.screen1button)
        button.setOnClickListener(){
//            val intent: Intent = Intent(
//                this,
//                    Activity2::class.java
//            )
//            startActivity(intent)


           var builder= AlertDialog.Builder(this)
            builder.setMessage("Alert On the Button")
            builder.setTitle("Alert Dialog")
            builder.setCancelable(true)
            builder.setNegativeButton("Close"){_,_->}
            builder.create().show()
        }
    }
}