package com.example.dddtesting.ipc.application.usecase

import com.example.dddtesting.gas_station.application.response.GasStationPriceResponse
import org.springframework.stereotype.Service

@Service
class GetMostExpensiveGasStationUseCase {
    fun execute(): List<GasStationPriceResponse> {
        return emptyList()
    }
}