package com.userdemo.userx.ports_and_adapters.application.port.`in`

import com.userdemo.userx.ports_and_adapters.application.domain.model.BookInfo
import com.userdemo.userx.ports_and_adapters.application.domain.model.BookName

/**
 * query books by bookName
 */
interface GetBookListUseCase {

    data class GetBooksQuery(
        val bookName: BookName
    )

    fun getBookList(query: GetBooksQuery): List<BookInfo>?

}