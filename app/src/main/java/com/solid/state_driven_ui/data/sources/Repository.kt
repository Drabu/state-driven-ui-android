package com.solid.state_driven_ui.data.sources

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.solid.state_driven_ui.data.structure.DataHolder
import com.solid.state_driven_ui.view.states.State
import com.solid.state_driven_ui.view.states.implementation.DataLoaded
import com.solid.state_driven_ui.view.states.implementation.FailedToLoadData
import com.solid.state_driven_ui.view.states.implementation.GettingDataFromRepository
import com.solid.state_driven_ui.view.states.implementation.InternetNotAvailableState

class Repository {
    private val dataStream = MutableLiveData<State>()

    fun getDataStream(): LiveData<State> = dataStream

    fun getData() {

        if (!isInternetConnected())
            dataStream.postValue(InternetNotAvailableState())

        dataStream.postValue(GettingDataFromRepository())

        val data = getDataFromServer()

        if (data != null)
            dataStream.postValue(DataLoaded(data))
        else
            dataStream.postValue(FailedToLoadData("Something went wrong!"))

    }

    private fun isInternetConnected() = true

    private fun getDataFromServer(): DataHolder? = DataHolder("Sample Data Set")

}