package com.trainee.domain.repository

import com.trainee.domain.models.CitiesList

interface RepositoryInterface {

    suspend fun getCities(): CitiesList
}