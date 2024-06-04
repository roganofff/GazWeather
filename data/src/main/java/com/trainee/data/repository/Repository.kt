package com.trainee.data.repository

import com.trainee.data.api.RetrofitInstance
import com.trainee.domain.models.CitiesList
import com.trainee.domain.repository.RepositoryInterface

class Repository : RepositoryInterface {
    override suspend fun getCities(): CitiesList {
        return RetrofitInstance.api.getCities()
    }
}