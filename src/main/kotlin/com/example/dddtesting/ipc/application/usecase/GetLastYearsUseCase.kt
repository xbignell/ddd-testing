package com.example.dddtesting.ipc.application.usecase

import com.example.dddtesting.ipc.application.response.IpcYearValueResponse
import com.example.dddtesting.ipc.domain.service.IpcDataGrouperService
import org.springframework.stereotype.Service
import java.time.Year

@Service
class GetLastYearsUseCase(private val ipcDataGrouperService: IpcDataGrouperService) {
    fun execute(years: Int): List<IpcYearValueResponse> {
        val ipcDataAverage = ipcDataGrouperService.getLastYears(years)
        return ipcDataAverage.map {
            IpcYearValueResponse(
                year = Year.of(it.year),
                value = String.format("%.2f", it.value).toDouble()
            )
        }
    }
}