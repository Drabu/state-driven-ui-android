package com.solid.state_driven_ui.view.states

import com.solid.state_driven_ui.databinding.ActivityMainBinding

abstract class State {
    open fun updateUI(binding: ActivityMainBinding) {
        //reset views
    }
}