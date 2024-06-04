package com.trainee.gazweather.di

import com.trainee.gazweather.home.HomeViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    viewModel<HomeViewModel> {
        HomeViewModel(
            getCitiesUseCase = get()
        )
    }
}