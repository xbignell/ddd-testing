package com.example.dddtesting.ipc.infrastructure.repository

import com.example.dddtesting.ipc.domain.entity.IpcDataEntity
import com.example.dddtesting.ipc.domain.repository.IpcDataRepositoryInterface
import com.example.dddtesting.utils.ArrayDestructor
import com.example.dddtesting.utils.ArrayDestructor.Companion.headTail
import com.github.doyaaaaaken.kotlincsv.dsl.csvReader
import org.springframework.stereotype.Service
import java.io.File

@Service
class IpcDataCSVRepository: IpcDataRepositoryInterface {

    override fun getAllYears(years: Int): List<IpcDataEntity> {
        val filename = "./datosCesta294186855.csv"
        val contentFile = csvReader().readAll(File(filename))
        val ipcDataList = transformToIpcDataEntity(contentFile.headTail().second)
        ipcDataList.sortedByDescending { it.year }
        return ipcDataList.take(years)
    }
    private fun transformToIpcDataEntity(content: List<List<String>>): MutableList<IpcDataEntity> {
        return content.map {
            val (head, tail) = it.headTail()
            IpcDataEntity(
                head.toInt(),
                tail.map { value -> value.toDouble() })
        } as MutableList<IpcDataEntity>
    }

}