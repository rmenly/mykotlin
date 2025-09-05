package com.userdemo.userx.ports_and_adapters.adapter.out.persistence.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.time.LocalDate
import java.time.LocalDateTime

/**
 * books
 */
@Entity
@Table(name = "books")
data class BookEntity(

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val bookId: Long,

    @Column(name = "title")
    val title: String,
    @Column(name = "author")
    val author: String,
    @Column(name = "published_date")
    val publishedDate: LocalDate,
    @Column(name = "isbn")
    val isbn: String,
    // 溯源
    @Column(name = "genre")
    val genre: String,
    @Column(name = "description")
    val description: String,
    @Column(name = "created_at")
    val createdAt: LocalDateTime,
    @Column(name = "updated_at")
    val updatedAt: LocalDateTime

)