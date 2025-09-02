package com.userdemo.userx.ports_and_adapters.application.port.out

import com.userdemo.userx.ports_and_adapters.application.domain.model.UserId
import com.userdemo.userx.ports_and_adapters.application.domain.model.UserInfo

interface LoadUserInfoPort {
    fun loadUserInfoBy(userId: UserId): UserInfo?
}