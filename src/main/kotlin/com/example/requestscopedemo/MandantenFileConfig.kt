package com.example.requestscopedemo

import java.io.File

interface MandantenFileConfig {
    fun getNachrichtenFile(
        nachrichtId: String,
        nachrichtentyp: Nachrichtentyp
    ): File
}
