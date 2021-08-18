package com.techsultan.detailsdisplay

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.techsultan.detailsdisplay.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSubmit.setOnClickListener {
            val name = binding.etName.text.toString()
            val track = binding.etTrack.text.toString()
            val email = binding.etEmail.text.toString()
            val slackId = binding.etSlackId.toString()
            val tvName = binding.tvName
            val tvEmail = binding.tvEmail
            val tvTrack = binding.tvTrack
            val tvSlackId = binding.tvSlackId

            if (name.isEmpty() || track.isEmpty() || email.isEmpty() || slackId.isEmpty()) {
                Toast.makeText(this, "Input your details correctly",
                    Toast.LENGTH_SHORT).show()
            } else {
                tvName.text = (name)
                tvTrack.text = track
                tvEmail.text = email
                tvSlackId.text = slackId
            }
        }

    }
}