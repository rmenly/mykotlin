package com.userdemo.userx.ports_and_adapters.application.domain.model

import java.time.LocalDateTime

data class UserInfo(

    val userId: Long,

    val userName: String,
    val password: String,
    val email: String,
    val createdAt: LocalDateTime,
    val updatedAt: LocalDateTime

)