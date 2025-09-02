package com.userdemo.userx.ports_and_adapters.adapter.out.persistence

import com.userdemo.userx.ports_and_adapters.application.domain.model.UserInfo
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository : JpaRepository<UserInfo, Long> {
    override fun getById(id: Long): UserInfo
}