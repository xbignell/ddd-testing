package com.example.dddtesting.gas_station.application.usecase

import com.example.dddtesting.gas_station.application.response.GasStationPriceResponse
import com.example.dddtesting.gas_station.domain.enum.GasTypeEnum
import com.example.dddtesting.ipc.application.usecase.GetMostExpensiveGasStationUseCase
import org.junit.Test
import org.junit.jupiter.api.Assertions

class GetMostExpensiveGasStationUseCaseTest {
//    val gasStationRepositoryInterface: GasStationRepositoryInterface = mock {
//        on { getMostExpensiveGasStation(GasTypeEnum.GASOIL_95_E5) } doReturn GasStationEntity(
//            "GRANADA",
//            "BAUL",
//            "AUTOVIA A-92 KM. 322",
//            GasTypeEnum.GASOIL_95_E5,
//            2.329
//        )
//    }

    val getMostExpensiveGasStationUseCase = GetMostExpensiveGasStationUseCase()

    @Test
    fun `Test get most expensive gasoil 95 should return the entity mapped correctly`() {
        Assertions.assertEquals(
            getMostExpensiveGasStationUseCase.execute(GasTypeEnum.GASOIL_95_E5), GasStationPriceResponse(
                "GRANADA",
                "BAUL",
                "AUTOVIA A-92 KM. 322",
                GasTypeEnum.GASOIL_95_E5,
                2.329
            )
        )
    }

}