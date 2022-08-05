package com.example.dddtesting.ipc.application

import com.example.dddtesting.ipc.application.response.IpcYearValueResponse
import com.example.dddtesting.ipc.application.usecase.GetLastYearsUseCase
import org.junit.Test
import org.junit.jupiter.api.Assertions
import org.junit.runner.RunWith
import org.mockito.InjectMocks
import org.mockito.junit.MockitoJUnitRunner
import java.time.Year

@RunWith(MockitoJUnitRunner::class)
class GetLastYearsUseCaseTest {

    @InjectMocks
    lateinit var getLastYearsUseCase: GetLastYearsUseCase

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