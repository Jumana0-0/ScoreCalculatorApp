package com.example.scorecalculator

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

   private var scoreA = 0
   private var scoreB =0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val scoreTeamA: TextView =findViewById(R.id.tv_ScoreTeamA)
        val scoreTeamB: TextView =findViewById(R.id.tv_ScoreTeamB)

        val btnsix: Button= findViewById(R.id.btnsix)
        val btnthree: Button= findViewById(R.id.btnthree)
        val btntwo: Button= findViewById(R.id.btntwo)
        val btnone: Button= findViewById(R.id.btnone)

        val btnsixB: Button= findViewById(R.id.btnsixB)
        val btnthreeB: Button= findViewById(R.id.btnthreeB)
        val btntwoB: Button= findViewById(R.id.btntwoB)
        val btnoneB: Button= findViewById(R.id.btnoneB)

        val btnreset: Button=findViewById(R.id.btnreset)

        //team A buttons
        btnsix.setOnClickListener {
            scoreA += 6
            scoreTeamA.text = scoreA.toString()
        }

        btntwo.setOnClickListener {
            scoreA += 2
            scoreTeamA.text = scoreA.toString()
        }

        btnthree.setOnClickListener {
            scoreA += 3
            scoreTeamA.text = scoreA.toString()
        }

        btnone.setOnClickListener {
            scoreA += 1
            scoreTeamA.text = scoreA.toString()
        }

        //team B buttons
        btnsixB.setOnClickListener {
            scoreB += 6
            scoreTeamB.text = scoreB.toString()
        }

        btnthreeB.setOnClickListener {
            scoreB += 3
            scoreTeamB.text = scoreB.toString()
        }

        btntwoB.setOnClickListener {
            scoreB += 2
            scoreTeamB.text = scoreB.toString()
        }

        btnoneB.setOnClickListener {
            scoreB += 1
            scoreTeamB.text = scoreB.toString()
        }

        btnreset.setOnClickListener {
            scoreA = 0
            scoreB = 0

            scoreTeamA.text = scoreA.toString()
            scoreTeamB.text = scoreB.toString()
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

}