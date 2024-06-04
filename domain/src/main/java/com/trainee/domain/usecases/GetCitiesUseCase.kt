package com.trainee.domain.usecases

import com.trainee.domain.models.CitiesList
import com.trainee.domain.repository.RepositoryInterface

class GetCitiesUseCase(private val repository: RepositoryInterface) {
    suspend fun getCities(): CitiesList = repository.getCities()
}