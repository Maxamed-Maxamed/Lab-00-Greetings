package com.example.greetings

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.greetings.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

      /* The code `binding = ActivityMainBinding.inflate(layoutInflater)` is inflating the layout file
      `activity_main.xml` and creating an instance of the `ActivityMainBinding` class. */
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

       /* The code `binding.greetingButton.setOnClickListener { ... }` is setting a click listener on
       the `greetingButton` view. When the button is clicked, the code inside the curly braces will
       be executed. */
        binding.greetingButton.setOnClickListener {
            val greetingText = getString(R.string.greeting_text)
            Toast.makeText(this, greetingText, Toast.LENGTH_SHORT).show()
        }


    }
}