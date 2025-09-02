package com.userdemo.userx.ports_and_adapters.application.port.`in`

import com.userdemo.userx.ports_and_adapters.application.domain.model.UserId
import com.userdemo.userx.ports_and_adapters.application.domain.model.UserInfo

interface GetUserInfoUseCase {

    data class GetUserQuery(
        val userId: UserId
    )

    fun getUserInfo(query: GetUserQuery): UserInfo?
}