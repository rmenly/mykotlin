package com.userdemo.userx.ports_and_adapters.adapter.out.persistence.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.time.LocalDateTime

@Entity
@Table(name = "users")
data class UserEntity(

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val userId: Long,

    @Column(name = "username")
    val userName: String,
    @Column(name = "password_hash")
    val password: String,
    @Column(name = "email")
    val email: String,
    @Column(name = "created_at")
    val createdAt: LocalDateTime,
    @Column(name = "updated_at")
    val updatedAt: LocalDateTime

)