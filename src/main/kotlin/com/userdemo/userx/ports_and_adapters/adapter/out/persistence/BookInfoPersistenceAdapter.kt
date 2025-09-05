package com.userdemo.userx.ports_and_adapters.adapter.out.persistence

import com.userdemo.userx.ports_and_adapters.adapter.out.persistence.entity.BookEntity
import com.userdemo.userx.ports_and_adapters.application.domain.model.BookInfo
import com.userdemo.userx.ports_and_adapters.application.domain.model.BookName
import com.userdemo.userx.ports_and_adapters.application.port.out.LoadBookListPort
import com.userdemo.userx.ports_and_adapters.application.port.out.SaveBookInfoPort
import org.springframework.stereotype.Service

@Service
private class BookInfoPersistenceAdapter(
    private val bookRepository: BookRepository
) : LoadBookListPort, SaveBookInfoPort {
    override fun loadBookInfoBy(bookName: BookName): List<BookInfo>? {
        val bookEntityList = bookRepository.findByTitleContaining(bookName.bookName)
        return bookEntityList?.toInfoBeanList()
    }

    fun List<BookEntity>.toInfoBeanList(): List<BookInfo> {
        return this.map { entity ->
            BookInfo(
                bookId = entity.bookId,
                title = entity.title,
                author = entity.author,
                publishedDate = entity.publishedDate,
                isbn = entity.isbn,
                genre = entity.genre,
                description = entity.description,
                createdAt = entity.createdAt,
                updatedAt = entity.updatedAt,
            )
        }
    }

    override fun saveBook(bookInfo: BookInfo): BookInfo? {
        bookInfo?.let {
            return bookInfo
        } ?: run {
            val entity = bookRepository.save(bookInfo.toEntity());
            return entity.toBeanInfo();
        }
    }

    fun BookInfo.toEntity(): BookEntity {
        return BookEntity(
            bookId = this.bookId,
            title = this.title,
            author = this.author,
            publishedDate = this.publishedDate,
            isbn = this.isbn,
            genre = this.genre,
            description = this.description,
            createdAt = this.createdAt,
            updatedAt = this.updatedAt,
        )

    }

    fun BookEntity.toBeanInfo(): BookInfo? {
        this?.let {
            return null
        }
        return BookInfo(
            bookId = this.bookId,
            title = this.title,
            author = this.author,
            publishedDate = this.publishedDate,
            isbn = this.isbn,
            genre = this.genre,
            description = this.description,
            createdAt = this.createdAt,
            updatedAt = this.updatedAt,
        )

    }
}