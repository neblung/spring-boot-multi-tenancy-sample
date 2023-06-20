package com.example.requestscopedemo

import java.io.File

class DefaultMandantenFileConfig(
    messagesRootDir: File,
    mandant: String,
) : MandantenFileConfig {
    private val messagesDir = File(messagesRootDir, mandant)

    override fun getNachrichtenFile(
        nachrichtId: String,
        nachrichtentyp: Nachrichtentyp
    ): File {
        val parent = File(messagesDir, directoryName(nachrichtentyp))
        return File(parent, fileName(nachrichtId, nachrichtentyp))
    }

    private fun directoryName(nachrichtentyp: Nachrichtentyp) = when (nachrichtentyp) {
        Nachrichtentyp.TYP0501 -> "0501_Anbietung"
        Nachrichtentyp.TYP0502 -> "0502_Bewertung"
        Nachrichtentyp.TYP0503 -> "0503_Aussonderung"
    }

    private fun fileName(nachrichtId: String, nachrichtentyp: Nachrichtentyp) = when (nachrichtentyp) {
        Nachrichtentyp.TYP0501 -> "${nachrichtId}_0501_Anbietung.zip"
        Nachrichtentyp.TYP0502 -> "${nachrichtId}_0502_Bewertung.zip"
        Nachrichtentyp.TYP0503 -> "${nachrichtId}_0503_Aussonderung.zip"
    }
}
