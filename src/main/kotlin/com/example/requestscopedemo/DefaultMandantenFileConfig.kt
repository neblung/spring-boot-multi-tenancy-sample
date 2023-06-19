package com.example.requestscopedemo

import java.io.File

class DefaultMandantenFileConfig(
    messagesRootDir: File,
    mandant: String,
) : MandantenFileConfig {
    private val messagesDir = File(messagesRootDir, mandant)

    override fun get0501File(nachrichtId: String): File {
        val parent = File(messagesDir, "0501_Anbietung")
        return File(parent, "${nachrichtId}_0501_Anbietung.zip")
    }

    override fun get0502File(nachrichtId: String): File {
        val parent = File(messagesDir, "0502_Bewertung")
        return File(parent, "${nachrichtId}_0502_Bewertung.zip")
    }

    override fun get0503File(nachrichtId: String): File {
        val parent = File(messagesDir, "0503_Aussonderung")
        return File(parent, "${nachrichtId}_0503_Aussonderung.zip")
    }
}
