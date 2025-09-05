package com.userdemo.userx.ports_and_adapters.application.domain.model

import java.time.LocalDate
import java.time.LocalDateTime

data class BookInfo(
    val bookId: Long,
    val title: String,
    val author: String,
    val publishedDate: LocalDate,
    val isbn: String,
    val genre: String,
    val description: String,
    val createdAt: LocalDateTime,
    val updatedAt: LocalDateTime,
)
