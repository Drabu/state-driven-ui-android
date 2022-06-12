package com.solid.state_driven_ui.view.states.implementation

import com.solid.state_driven_ui.data.structure.DataHolder
import com.solid.state_driven_ui.databinding.ActivityMainBinding
import com.solid.state_driven_ui.view.states.State

class DataLoaded(val dataLoaded: DataHolder) : State() {
    override fun updateUI(binding: ActivityMainBinding) {
        super.updateUI(binding)
    }
}

