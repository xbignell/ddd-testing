package com.example.dddtesting.gas_station.domain.entity

import com.example.dddtesting.gas_station.domain.enum.GasTypeEnum

data class GasTypePriceEntity(val gasType: GasTypeEnum, val price: Double)
