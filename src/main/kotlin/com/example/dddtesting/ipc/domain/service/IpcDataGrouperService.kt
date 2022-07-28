package com.example.dddtesting.ipc.domain.service

import com.example.dddtesting.ipc.domain.entity.IpcDataAverageEntity
import com.example.dddtesting.ipc.domain.entity.IpcDataEntity
import com.example.dddtesting.ipc.domain.repository.IpcDataRepositoryInterface
import org.springframework.stereotype.Service

@Service
class IpcDataGrouperService(private val ipcDataRepository: IpcDataRepositoryInterface) {
    fun getLastYears(years: Int): List<IpcDataAverageEntity> {
        val allYears = ipcDataRepository.getAllYears(years)
        return allYears.map { IpcDataAverageEntity(year = it.year, value = it.values.average()) }
    }
}