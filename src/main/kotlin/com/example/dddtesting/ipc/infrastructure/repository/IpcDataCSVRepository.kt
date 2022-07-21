package com.example.dddtesting.ipc.infrastructure.repository

import com.example.dddtesting.ipc.domain.entity.IpcDataEntity
import com.example.dddtesting.ipc.domain.repository.IpcDataRepositoryInterface
import org.springframework.stereotype.Service

@Service
class IpcDataCSVRepository: IpcDataRepositoryInterface {
    override fun getAllYears(years: Int): List<IpcDataEntity> {
        TODO("Not yet implemented")
    }
}