package com.sergio.myapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val showButton: Button = findViewById(R.id.show_button)

        showButton.setOnClickListener {
            showSckbar(it)
        }
    }



    private fun showSckbar(view: View) {
        Snackbar.make(this, view, "Snackbar show", Snackbar.LENGTH_INDEFINITE)
            .setAction("Action") {
                Toast.makeText(this, "Toast!", Toast.LENGTH_LONG).show()
            }
            .show()
    }
}

