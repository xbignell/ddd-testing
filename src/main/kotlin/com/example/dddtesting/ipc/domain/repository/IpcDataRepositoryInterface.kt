package com.example.dddtesting.ipc.domain.repository

import com.example.dddtesting.ipc.domain.entity.IpcDataEntity
interface IpcDataRepositoryInterface {
    fun getAllYears(years: Int): List<IpcDataEntity>
}