package com.trainee.domain.models

import java.io.Serializable

data class City(
    val id: Int,
    val name: String,
    val latitude: Double,
    val longitude: Double
) : Serializable
