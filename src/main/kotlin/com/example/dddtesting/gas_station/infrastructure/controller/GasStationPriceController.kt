package com.example.dddtesting.gas_station.infrastructure.controller

import com.example.dddtesting.gas_station.application.response.GasStationPriceResponse
import com.example.dddtesting.ipc.application.usecase.GetMostExpensiveGasStationUseCase
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("gas-station-price")
class GasStationPriceController(private val getMostExpensiveGasStationUseCase: GetMostExpensiveGasStationUseCase) {

    @GetMapping("last-updated")
    fun getMostExpensiveGasStation(): ResponseEntity<List<GasStationPriceResponse>> {
        return ResponseEntity.ok(getMostExpensiveGasStationUseCase.execute())
    }

    // get last gas station updated
    // get all sorted by price
}