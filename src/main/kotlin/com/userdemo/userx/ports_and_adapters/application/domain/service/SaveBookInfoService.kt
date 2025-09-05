package com.userdemo.userx.ports_and_adapters.application.domain.service

import com.userdemo.userx.ports_and_adapters.application.domain.model.BookInfo
import com.userdemo.userx.ports_and_adapters.application.port.`in`.SaveBookUseCase
import org.springframework.stereotype.Service

@Service
private class SaveBookInfoService(
    val saveBookInfoPort: SaveBookUseCase
) : SaveBookUseCase {
    override fun saveBook(bookInfo: BookInfo): BookInfo {
        return saveBookInfoPort.saveBook(bookInfo)
    }

}