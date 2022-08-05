package com.example.dddtesting.ipc.domain.service

import com.example.dddtesting.ipc.domain.entity.IpcDataAverageEntity
import com.example.dddtesting.ipc.domain.entity.IpcDataEntity
import com.example.dddtesting.ipc.domain.repository.IpcDataRepositoryInterface
import org.junit.Test
import org.junit.jupiter.api.Assertions
import org.junit.runner.RunWith
import org.mockito.junit.MockitoJUnitRunner
import org.mockito.kotlin.doReturn
import org.mockito.kotlin.mock
import org.mockito.kotlin.whenever

@RunWith(MockitoJUnitRunner::class)
class IpcDataGrouperServiceTest {

    val ipcDataRepository: IpcDataRepositoryInterface = mock {
        on { getYears(2) } doReturn listOf(
            IpcDataEntity(
                2021,
                listOf(0.5, 0, 1.3, 2.2, 2.7, 2.7, 2.9, 3.3, 4, 5.4, 5.5, 6.5) as List<Double>
            ),
            IpcDataEntity(
                2020,
                listOf(1.1, 0.7, 0, -0.7, -0.9, -0.3, -0.6, -0.5, -0.4, -0.8, -0.8, -0.5) as List<Double>
            )
        )
    }

    val ipcDataGrouperService = IpcDataGrouperService(ipcDataRepository)

    @Test
    fun `Test execute with value 2 in year params should return 2 years`() {
        Assertions.assertEquals(
            ipcDataGrouperService.getLastYears(2), listOf(
                IpcDataAverageEntity(2021, 3.0833333333333335),
                IpcDataAverageEntity(2020, -0.30833333333333335)
            )
        )
    }

    @Test
    fun `Test execute with value 1 in year params should return only 1 year`() {
        whenever(ipcDataRepository.getYears(1)).thenReturn(
            listOf(
                IpcDataEntity(
                    2021,
                    listOf(0.5, 0, 1.3, 2.2, 2.7, 2.7, 2.9, 3.3, 4, 5.4, 5.5, 6.5) as List<Double>
                )
            )
        )

        Assertions.assertEquals(
            ipcDataGrouperService.getLastYears(1), listOf(
                IpcDataAverageEntity(2021, 3.0833333333333335),
            )
        )
    }

    @Test
    fun `Test execute with value 0 in year params should return only 1 year`() {
        whenever(ipcDataRepository.getYears(1)).thenReturn(
            listOf(
                IpcDataEntity(
                    2021,
                    listOf(0.5, 0, 1.3, 2.2, 2.7, 2.7, 2.9, 3.3, 4, 5.4, 5.5, 6.5) as List<Double>
                )
            )
        )

        Assertions.assertEquals(
            ipcDataGrouperService.getLastYears(0), listOf(
                IpcDataAverageEntity(2021, 3.0833333333333335),
            )
        )
    }
}