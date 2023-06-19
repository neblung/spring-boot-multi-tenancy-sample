package com.example.requestscopedemo

import org.springframework.stereotype.Service

@Service
class FileService(private val mandantenFileConfig: MandantenFileConfig) {
    fun get0501File(nachrichtId: String): String {
        return mandantenFileConfig.get0501File(nachrichtId).absolutePath
    }

    fun get0502File(nachrichtId: String): String {
        return mandantenFileConfig.get0502File(nachrichtId).absolutePath
    }

    fun get0503File(nachrichtId: String): String {
        return mandantenFileConfig.get0503File(nachrichtId).absolutePath
    }
}
