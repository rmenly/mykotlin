package com.userdemo.userx.ports_and_adapters.application.port.out

import com.userdemo.userx.ports_and_adapters.application.domain.model.BookInfo
import com.userdemo.userx.ports_and_adapters.application.domain.model.BookName

interface LoadBookListPort {
    fun loadBookInfoBy(bookName: BookName): List<BookInfo>?
}