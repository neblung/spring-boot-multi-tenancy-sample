package com.example.requestscopedemo

import org.springframework.stereotype.Service

@Service
class FileService(private val mandantenFileConfig: MandantenFileConfig) {
    fun get0501File(nachrichtId: String): FileInfo {
        return FileInfo(path(nachrichtId, Nachrichtentyp.TYP0501))
    }

    fun get0502File(nachrichtId: String): FileInfo {
        return FileInfo(path(nachrichtId, Nachrichtentyp.TYP0502))
    }

    fun get0503File(nachrichtId: String): FileInfo {
        return FileInfo(path(nachrichtId, Nachrichtentyp.TYP0503))
    }

    private fun path(nachrichtId: String, nachrichtentyp: Nachrichtentyp): String =
        mandantenFileConfig.getNachrichtenFile(nachrichtId, nachrichtentyp).absolutePath
}
