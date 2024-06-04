package com.trainee.gazweather.home

import androidx.lifecycle.ViewModel
import com.trainee.domain.usecases.GetCitiesUseCase

class HomeViewModel(
    private val getCitiesUseCase: GetCitiesUseCase
) : ViewModel() {

}