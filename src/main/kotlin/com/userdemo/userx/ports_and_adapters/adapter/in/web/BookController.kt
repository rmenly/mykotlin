package com.userdemo.userx.ports_and_adapters.adapter.`in`.web

import com.userdemo.userx.ports_and_adapters.application.domain.model.BookName
import com.userdemo.userx.ports_and_adapters.application.port.`in`.GetBookListUseCase
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/book")
class BookController(
    val getBookListUseCase: GetBookListUseCase
) {

    @GetMapping("books/{bookName}")
    fun getUserInfo(
        @PathVariable("bookName") bookName: String
    ): ResponseEntity<in Nothing> {
//        bookName.isNullOrEmpty().let {
//            return ResponseEntity.notFound().build<Unit>()
//        }

        val bookinfoList =
            getBookListUseCase.getBookList(GetBookListUseCase.GetBooksQuery(bookName = BookName(bookName)))
        return when (bookinfoList?.isEmpty()) {
            null -> ResponseEntity.notFound().build<Unit>()
            else -> ResponseEntity.ok(mapOf("info" to bookinfoList.toString()))
        }
    }

    @GetMapping("save/{book}")
    fun saveBook(
        @PathVariable("bookName") bookName: String
    ): ResponseEntity<in Nothing> {
//        bookName.isNullOrEmpty().let {
//            return ResponseEntity.notFound().build<Unit>()
//        }

        val bookinfoList =
            getBookListUseCase.getBookList(GetBookListUseCase.GetBooksQuery(bookName = BookName(bookName)))
        return when (bookinfoList?.isEmpty()) {
            null -> ResponseEntity.notFound().build<Unit>()
            else -> ResponseEntity.ok(mapOf("info" to bookinfoList.toString()))
        }
    }

}