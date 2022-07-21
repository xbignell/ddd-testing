package com.example.dddtesting.ipc.infrastructure.controller

import com.example.dddtesting.ipc.application.usecase.GetLastYearsUseCase
import com.example.dddtesting.ipc.application.response.IpcYearValueResponse
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("ipc")
class IpcDataController(private val getLastYearsUseCase: GetLastYearsUseCase) {

    @GetMapping("last-months/{months}")
    fun getLastMonths(@PathVariable("months") month: Int): ResponseEntity<List<IpcYearValueResponse>> {
        return ResponseEntity.ok(getLastYearsUseCase.execute(2))
    }

}