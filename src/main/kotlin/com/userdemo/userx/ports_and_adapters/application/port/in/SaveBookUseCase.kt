package com.userdemo.userx.ports_and_adapters.application.port.`in`

import com.userdemo.userx.ports_and_adapters.application.domain.model.BookInfo

interface SaveBookUseCase {

    fun saveBook(bookInfo: BookInfo): BookInfo

}