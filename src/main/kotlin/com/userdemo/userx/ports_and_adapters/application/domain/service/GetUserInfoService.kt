package com.userdemo.userx.ports_and_adapters.application.domain.service

import com.userdemo.userx.ports_and_adapters.application.domain.model.UserInfo
import com.userdemo.userx.ports_and_adapters.application.port.`in`.GetUserInfoUseCase
import com.userdemo.userx.ports_and_adapters.application.port.out.LoadUserInfoPort
import org.springframework.stereotype.Service

@Service
private class GetUserInfoService(
    val loadUserInfoPort: LoadUserInfoPort
) : GetUserInfoUseCase {
    override fun getUserInfo(query: GetUserInfoUseCase.GetUserQuery): UserInfo? {
        return loadUserInfoPort.loadUserInfoBy(query.userId)
    }

}