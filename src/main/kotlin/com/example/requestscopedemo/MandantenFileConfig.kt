package com.example.requestscopedemo

import java.io.File

interface MandantenFileConfig {
    fun get0501File(mandant: String, nachrichtId: String): File
    fun get0502File(mandant: String, nachrichtId: String): File
    fun get0503File(mandant: String, nachrichtId: String): File
}
