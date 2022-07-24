package com.example.dddtesting.ipc.application.usecase

import com.example.dddtesting.ipc.application.response.IpcYearValueResponse
import org.springframework.stereotype.Service
import java.time.Year

@Service
class GetLastYearsUseCase {
    fun execute(months: Int): List<IpcYearValueResponse> {
        return listOf(
            IpcYearValueResponse(Year.of(2021), 3.08),
            IpcYearValueResponse( Year.of(2020), 0.30)
        )
    }
}