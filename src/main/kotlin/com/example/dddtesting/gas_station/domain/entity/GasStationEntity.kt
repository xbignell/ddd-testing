package com.example.dddtesting.gas_station.domain.entity

import com.example.dddtesting.gas_station.domain.enum.GasTypeEnum
import java.util.*

data class GasStationEntity(
    val province: String,
    val town: String,
    val location: String,
    val zipCode: String,
    val address: String,
    val margin: String,
    val longitude: Double,
    val latitude: Double,
    val lastUpdate: Date,
    val sign: String,
    val sellType: String,
    val rem: String,
    val schedule: String,
    val serviceType: String,
    val prices: Map<GasTypeEnum, Double>,
)


