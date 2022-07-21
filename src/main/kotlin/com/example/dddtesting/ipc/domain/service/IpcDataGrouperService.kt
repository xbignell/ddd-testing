package com.example.dddtesting.ipc.domain.service

import com.example.dddtesting.ipc.domain.entity.IpcDataEntity
import com.example.dddtesting.ipc.domain.repository.IpcDataRepositoryInterface
import org.springframework.stereotype.Service

@Service
class IpcDataGrouperService(private val ipcDataRepository: IpcDataRepositoryInterface) {
    fun getLastYears(years: Int): List<IpcDataEntity> {
        val allYears = ipcDataRepository.getAllYears(years)
        return allYears
    }
}