package com.example.dddtesting.gas_station.infrastructure.repository

import com.example.dddtesting.gas_station.domain.entity.GasStationEntity
import com.example.dddtesting.gas_station.domain.repository.GasStationRepositoryInterface
import org.springframework.stereotype.Service

@Service
class GasStationRepository: GasStationRepositoryInterface {
    override fun getMostExpensiveGasStation(): GasStationEntity {
        TODO("Not yet implemented")
    }
}