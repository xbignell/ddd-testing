package com.example.dddtesting.gas_station.application.response

import com.example.dddtesting.gas_station.domain.enum.GasTypeEnum

data class GasStationPriceResponse(val location: String, val address: String, val prices: Map<GasTypeEnum, Double>)
