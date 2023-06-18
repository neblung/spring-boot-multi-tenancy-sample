package com.example.requestscopedemo

import org.springframework.stereotype.Service

@Service
class FileService(private val mandantenFileConfig: MandantenFileConfig) {
    fun get0501File(mandant: String, nachrichtId: String): String {
        return mandantenFileConfig.get0501File(mandant, nachrichtId).absolutePath
    }

    fun get0502File(mandant: String, nachrichtId: String): String {
        return mandantenFileConfig.get0502File(mandant, nachrichtId).absolutePath
    }

    fun get0503File(mandant: String, nachrichtId: String): String {
        return mandantenFileConfig.get0503File(mandant, nachrichtId).absolutePath
    }
}
