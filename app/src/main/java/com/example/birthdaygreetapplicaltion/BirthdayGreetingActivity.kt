package com.example.birthdaygreetapplicaltion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.birthdaygreetapplicaltion.databinding.ActivityBirthdayGreetingBinding


private lateinit var binding: ActivityBirthdayGreetingBinding

class BirthdayGreetingActivity : AppCompatActivity() {

    companion object {
        const val NAME_EXTRA = "name_extra"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBirthdayGreetingBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val name = intent.getStringExtra(NAME_EXTRA)
        binding.textView3.text = "Happy Birthday $name"
    }
}

