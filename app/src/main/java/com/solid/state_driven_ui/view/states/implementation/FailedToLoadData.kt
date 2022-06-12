package com.solid.state_driven_ui.view.states.implementation

import com.solid.state_driven_ui.databinding.ActivityMainBinding
import com.solid.state_driven_ui.view.states.State

class FailedToLoadData(val errorMessage: String) : State() {
    override fun updateUI(binding: ActivityMainBinding) {
        super.updateUI(binding)
    }
}
