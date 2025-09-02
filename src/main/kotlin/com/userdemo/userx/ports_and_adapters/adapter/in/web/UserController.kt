package com.userdemo.userx.ports_and_adapters.adapter.`in`.web

import com.userdemo.userx.ports_and_adapters.application.domain.model.UserId
import com.userdemo.userx.ports_and_adapters.application.port.`in`.GetUserInfoUseCase
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/user")
class UserController(
    val getUserInfoUseCase: GetUserInfoUseCase
) {

    @GetMapping("users/{id}")
    fun getUserInfo(
        @PathVariable("id") id: Long
    ): ResponseEntity<in Nothing> {
        id.validateAll("bad userId")?.let {
            return it
        }
        val userInfo = getUserInfoUseCase.getUserInfo(GetUserInfoUseCase.GetUserQuery(userId = UserId(id)))
        return when(userInfo) {
            null -> ResponseEntity.notFound().build<Unit>()
            else -> ResponseEntity.ok(mapOf("info" to userInfo.toString()))
        }
    }

}

fun Long.validateAll(msg: String?): ResponseEntity<in Nothing>? =
    if (this < 0)
        ResponseEntity.status(HttpStatus.BAD_REQUEST)
            .body("error" to (msg ?: "should bigger than zero"))
    else null