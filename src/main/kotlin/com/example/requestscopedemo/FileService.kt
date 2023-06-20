package com.example.requestscopedemo

import org.springframework.stereotype.Service

@Service
class FileService(private val mandantenFileConfig: MandantenFileConfig) {
    fun get0501File(nachrichtId: String): String {
        return mandantenFileConfig.getNachrichtenFile(nachrichtId, Nachrichtentyp.TYP0501).absolutePath
    }

    fun get0502File(nachrichtId: String): String {
        return mandantenFileConfig.getNachrichtenFile(nachrichtId, Nachrichtentyp.TYP0502).absolutePath
    }

    fun get0503File(nachrichtId: String): String {
        return mandantenFileConfig.getNachrichtenFile(nachrichtId, Nachrichtentyp.TYP0503).absolutePath
    }
}
