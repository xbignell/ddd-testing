package com.example.dddtesting.ipc.application.usecase

import com.example.dddtesting.gas_station.application.response.GasStationPriceResponse
import org.springframework.stereotype.Service

@Service
class GetMostExpensiveGasStation() {
    fun execute(): List<GasStationPriceResponse> {

    }
}