package com.solid.state_driven_ui.view.model

import com.solid.state_driven_ui.data.sources.Repository

class ActivityViewModel {

    private val repository = Repository()

    fun getDataStream() = repository.getDataStream()

}