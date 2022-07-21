package com.example.dddtesting.application

import com.example.dddtesting.ipc.application.usecase.GetLastYearsUseCase
import com.example.dddtesting.ipc.application.response.IpcYearValueResponse
import org.junit.Test
import org.junit.jupiter.api.Assertions
import java.time.Year

class GetLastYearsUseCaseTest {

    private val getLastYearsUseCase = GetLastYearsUseCase()

    @Test
    fun `Test execute with value 2 in year params should return 2 years`() {
        Assertions.assertEquals(getLastYearsUseCase.execute(2), listOf(
            IpcYearValueResponse(Year.of(2021), 5),
            IpcYearValueResponse( Year.of(2021), 6)
        ))
    }
}