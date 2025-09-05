package com.userdemo.userx.ports_and_adapters.adapter.out.persistence

import com.userdemo.userx.ports_and_adapters.adapter.out.persistence.entity.BookEntity
import org.springframework.data.jpa.repository.JpaRepository

interface BookRepository : JpaRepository<BookEntity, Long> {
    override fun getById(id: Long): BookEntity

    fun findByTitleContaining(bookName: String?): List<BookEntity>?
    fun save(bookEntity: BookEntity): BookEntity
}