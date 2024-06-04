package com.trainee.gazweather.di

import com.trainee.domain.usecases.GetCitiesUseCase
import org.koin.dsl.module

val domainModule = module {
    factory<GetCitiesUseCase> { GetCitiesUseCase(repository = get()) }
}