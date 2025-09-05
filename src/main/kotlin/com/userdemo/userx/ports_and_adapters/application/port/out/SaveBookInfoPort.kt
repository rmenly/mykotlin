package com.userdemo.userx.ports_and_adapters.application.port.out

import com.userdemo.userx.ports_and_adapters.application.domain.model.BookInfo

interface SaveBookInfoPort {
    fun saveBook(bookInfo: BookInfo): BookInfo?

}