package com.erdi.errorhandlingcleanarch.domain

import com.erdi.errorhandlingcleanarch.util.Resource

interface MyRepository {
    suspend fun submitEmail(email: String): Resource<Unit>
}