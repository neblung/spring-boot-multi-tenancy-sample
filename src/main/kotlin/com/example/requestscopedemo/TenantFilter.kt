package com.example.requestscopedemo

import com.example.requestscopedemo.TenantContext.currentTenant
import jakarta.servlet.*
import jakarta.servlet.http.HttpServletRequest
import org.springframework.core.annotation.Order
import org.springframework.stereotype.Component
import java.io.IOException

@Component
@Order(1)
class TenantFilter : Filter {
    @Throws(IOException::class, ServletException::class)
    override fun doFilter(
        request: ServletRequest,
        response: ServletResponse,
        chain: FilterChain,
    ) {
        (request as HttpServletRequest).getHeader("Mandant")?.let { currentTenant = it }
        try {
            chain.doFilter(request, response)
        } finally {
            TenantContext.reset()
        }
    }
}
