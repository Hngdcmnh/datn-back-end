package com.sudoo.apigateway.filter

internal enum class ApiContract(val paths: List<String>) {
    UNSECURED_API_ENDPOINTS(
        listOf(
            "/sign-in",
            "/sign-up",
            "/logout",
            "/generate-otp",
            "/verify-otp",
            "/images",
            "/return-vnpay",
            "/ipn-vnpay",
            "/static",
            "/templates",
            "/share",
        )
    ),
    INTERNAL_API_ENDPOINTS(listOf("/internal")),
}