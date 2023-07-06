package com.example.temitope_adebiyi_score

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.temitope_adebiyi_score.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var team1Score = 0
    private var team2Score = 0
    private var scoreIncrement = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.team1IncreaseButton.setOnClickListener {
            team1Score += scoreIncrement
            binding.team1ScoreTextView.text = team1Score.toString()
        }

        binding.team1DecreaseButton.setOnClickListener {
            team1Score -= scoreIncrement
            binding.team1ScoreTextView.text = team1Score.toString()
        }

        binding.team2IncreaseButton.setOnClickListener {
            team2Score += scoreIncrement
            binding.team2ScoreTextView.text = team2Score.toString()
        }

        binding.team2DecreaseButton.setOnClickListener {
            team2Score -= scoreIncrement
            binding.team2ScoreTextView.text = team2Score.toString()
        }

        binding.score1RadioButton.setOnClickListener {
            scoreIncrement = 1
        }

        binding.score2RadioButton.setOnClickListener {
            scoreIncrement = 2
        }

        binding.score3RadioButton.setOnClickListener {
            scoreIncrement = 3
        }
    }
}
