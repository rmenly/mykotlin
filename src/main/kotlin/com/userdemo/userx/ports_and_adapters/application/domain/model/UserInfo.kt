package com.userdemo.userx.ports_and_adapters.application.domain.model

import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
@Table(name = "users")
data class UserInfo(

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val userId: Long,

    @Column(name = "username")
    val userName: String,
    @Column(name = "password")
    val password: String,
    @Column(name = "email")
    val email: String,
    @Column(name = "created_at")
    val createdAt: LocalDateTime,
    @Column(name = "updated_at")
    val updatedAt: LocalDateTime

)
