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
            IpcYearValueResponse(Year.of(2021), 3.08),
            IpcYearValueResponse( Year.of(2020), 0.30)
        ))
    }

    @Test
    fun `Test execute with value 1 in year params should return only 1 year`() {
        Assertions.assertEquals(getLastYearsUseCase.execute(1), listOf(
            IpcYearValueResponse(Year.of(2021), 3.08),
        ))
    }

    @Test
    fun `Test execute with value 0 in year params should return only 1 year`() {
        Assertions.assertEquals(getLastYearsUseCase.execute(0), listOf(
            IpcYearValueResponse(Year.of(2021), 3.08),
        ))
    }
}