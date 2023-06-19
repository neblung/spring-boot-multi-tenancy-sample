package com.example.requestscopedemo

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ResponseStatus
import java.util.logging.Logger

private val log = Logger.getLogger("TenantContext")

object TenantContext {
    private val CURRENT_TENANT = ThreadLocal<String?>()

    var currentTenant: String
        get() = CURRENT_TENANT.get() ?: fail()
        set(tenant) {
            CURRENT_TENANT.set(tenant)
        }

    private fun fail(): Nothing {
        log.warning("no tenant provided")
        throw NoTenantProvidedException()
    }

    fun reset() {
        CURRENT_TENANT.set(null)
    }
}

@ResponseStatus(code = HttpStatus.BAD_REQUEST, reason = "No tenant provided")
class NoTenantProvidedException : RuntimeException("No tenant provided")
