package com.example.requestscopedemo

import org.springframework.web.bind.annotation.*

@RequestMapping("/api")
@RestController()
class ApiRestController(
    private val fileService: FileService
) {
    @GetMapping("mandanten")
    fun getMandanten() = listOf("tic", "tac", "toe")

    @GetMapping("file0501/{id}")
    fun get0501File(@PathVariable id: String, @RequestHeader("Mandant") mandant: String): String {
        return fileService.get0501File(mandant, id)
    }

    @GetMapping("file0502/{id}")
    fun get0502File(@PathVariable id: String, @RequestHeader("Mandant") mandant: String): String {
        return fileService.get0502File(mandant, id)
    }

    @GetMapping("file0503/{id}")
    fun get0503File(@PathVariable id: String, @RequestHeader("Mandant") mandant: String): String {
        return fileService.get0503File(mandant, id)
    }
}
