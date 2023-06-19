package com.example.requestscopedemo

import java.io.File

interface MandantenFileConfig {
    fun get0501File(nachrichtId: String): File
    fun get0502File(nachrichtId: String): File
    fun get0503File(nachrichtId: String): File
}
