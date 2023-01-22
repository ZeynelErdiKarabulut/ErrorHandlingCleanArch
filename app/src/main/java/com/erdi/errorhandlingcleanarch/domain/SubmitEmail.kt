package com.erdi.errorhandlingcleanarch.domain

import com.erdi.errorhandlingcleanarch.R
import com.erdi.errorhandlingcleanarch.data.MyRepositoryImpl
import com.erdi.errorhandlingcleanarch.util.Resource
import com.erdi.errorhandlingcleanarch.util.UiText

class SubmitEmail(
    private val repository: MyRepository = MyRepositoryImpl()
) {
    suspend fun execute(email: String): Resource<Unit> {
        if(!email.contains("@")) {
            return Resource.Error(
                UiText.StringResource(R.string.error_invalid_email)
            )
        }
        return repository.submitEmail(email)
    }
}