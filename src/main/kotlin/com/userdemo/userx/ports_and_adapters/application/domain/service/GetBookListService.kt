package com.userdemo.userx.ports_and_adapters.application.domain.service

import com.userdemo.userx.ports_and_adapters.application.domain.model.BookInfo
import com.userdemo.userx.ports_and_adapters.application.port.`in`.GetBookListUseCase
import com.userdemo.userx.ports_and_adapters.application.port.out.LoadBookListPort
import org.springframework.stereotype.Service

@Service
private class GetBookListService(
    val loadBookListPort: LoadBookListPort
) : GetBookListUseCase {
    override fun getBookList(query: GetBookListUseCase.GetBooksQuery): List<BookInfo>? {
        return loadBookListPort.loadBookInfoBy(query.bookName)
    }

}