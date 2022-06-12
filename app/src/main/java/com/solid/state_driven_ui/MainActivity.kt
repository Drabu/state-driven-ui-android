package com.solid.state_driven_ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.solid.state_driven_ui.databinding.ActivityMainBinding
import com.solid.state_driven_ui.view.model.ActivityViewModel

class MainActivity : AppCompatActivity() {

    private val activityViewModel = ActivityViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        val dataStream = activityViewModel.getDataStream()

        dataStream.observe(this) {
            it.updateUI(binding)
        }

    }
}