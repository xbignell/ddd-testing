package com.example.dddtesting.gas_station.domain.repository

import com.example.dddtesting.gas_station.domain.entity.GasStationEntity

interface GasStationRepositoryInterface {
    fun getMostExpensiveGasStation(): GasStationEntity
}