package com.belveth.bullettime.domain.user

import com.belveth.bullettime.domain.user.service.UserService
import com.belveth.bullettime.domain.user.dto.UserDto
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable

@RestController
@RequestMapping("/users")
class UserController(
    val userService: UserService,
) {
  @GetMapping("/{id}")
  fun getUser(@PathVariable id: Long): UserDto = userService.getUser(id)
}
