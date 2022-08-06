package com.example.dddtesting.ipc.application.usecase

import com.example.dddtesting.gas_station.application.response.GasStationPriceResponse
import com.example.dddtesting.gas_station.domain.enum.GasTypeEnum
import org.springframework.stereotype.Service

@Service
class GetMostExpensiveGasStationUseCase {
    fun execute(gasType: GasTypeEnum): GasStationPriceResponse {
        return GasStationPriceResponse(
            "GRANADA",
            "BAUL",
            "AUTOVIA A-92 KM. 322",
            GasTypeEnum.GASOIL_95_E5,
            2.329
        )
    }
}