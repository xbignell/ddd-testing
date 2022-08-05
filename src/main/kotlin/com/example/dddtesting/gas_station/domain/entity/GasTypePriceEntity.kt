package com.example.dddtesting.gas_station.application.response

import com.example.dddtesting.gas_station.domain.enum.GasTypeEnum

data class GasTypePriceResponse(val gasType: GasTypeEnum, val price: Double)
