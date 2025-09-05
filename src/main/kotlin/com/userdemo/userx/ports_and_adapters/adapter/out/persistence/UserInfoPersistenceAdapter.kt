package com.userdemo.userx.ports_and_adapters.adapter.out.persistence

import com.userdemo.userx.ports_and_adapters.adapter.out.persistence.entity.UserEntity
import com.userdemo.userx.ports_and_adapters.application.domain.model.UserId
import com.userdemo.userx.ports_and_adapters.application.domain.model.UserInfo
import com.userdemo.userx.ports_and_adapters.application.port.out.LoadUserInfoPort
import org.springframework.stereotype.Service

@Service
private class UserInfoPersistenceAdapter(
    private val userRepository: UserRepository
) : LoadUserInfoPort {

    override fun loadUserInfoBy(userId: UserId): UserInfo? {
        val userEntity = userRepository.getById(userId.id);
        return userEntity.toBean()
    }


    fun UserEntity.toBean(): UserInfo? {
        this?.let {
            return null
        }
        return UserInfo(
            userId = userId ?: 0,
            userName = userName,
            password = password,
            email = email,
            createdAt = createdAt,
            updatedAt = updatedAt
        )

    }

}