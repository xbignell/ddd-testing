package com.example.dddtesting.gas_station.application.response

import com.example.dddtesting.gas_station.domain.enum.GasTypeEnum

data class GasStationPriceResponse(val province: String, val location: String, val address: String, val gasType: GasTypeEnum, val price: Double)
