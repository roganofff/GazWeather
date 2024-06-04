package com.trainee.data.api

import com.trainee.domain.models.CitiesList


interface ApiInterface {
    suspend fun getCities(): CitiesList
}