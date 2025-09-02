package com.userdemo.userx.ports_and_adapters.adapter.out.persistence

import com.userdemo.userx.ports_and_adapters.application.domain.model.UserId
import com.userdemo.userx.ports_and_adapters.application.domain.model.UserInfo
import com.userdemo.userx.ports_and_adapters.application.port.out.LoadUserInfoPort
import org.springframework.stereotype.Service

@Service
private class UserInfoPersistenceAdapter(
    private val userRepository: UserRepository
) : LoadUserInfoPort {

    override fun loadUserInfoBy(userId: UserId): UserInfo {
        return userRepository.getById(userId.id);
    }
}