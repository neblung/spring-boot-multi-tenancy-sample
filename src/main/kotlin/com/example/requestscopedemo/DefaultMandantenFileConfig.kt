package com.example.requestscopedemo

import java.io.File

class DefaultMandantenFileConfig(
    private val messagesDir: File
) : MandantenFileConfig {
    override fun get0501File(mandant: String, nachrichtId: String): File {
        val parent = File(mandantDir(mandant), "0501_Anbietung")
        return File(parent, "${nachrichtId}_0501_Anbietung.zip")
    }

    override fun get0502File(mandant: String, nachrichtId: String): File {
        val parent = File(mandantDir(mandant), "0502_Bewertung")
        return File(parent, "${nachrichtId}_0502_Bewertung.zip")
    }

    override fun get0503File(mandant: String, nachrichtId: String): File {
        val parent = File(mandantDir(mandant), "0503_Aussonderung")
        return File(parent, "${nachrichtId}_0503_Aussonderung.zip")
    }

    private fun mandantDir(mandant: String): File {
        return File(messagesDir, mandant)
    }
}
