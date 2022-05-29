package com.belveth.bullettime.domain.user

import com.belveth.bullettime.domain.user.dto.CreateUserDto
import com.belveth.bullettime.domain.user.dto.UserDto
import com.belveth.bullettime.domain.user.service.UserService
import org.springframework.http.HttpStatus
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.DeleteMapping

@RestController
@RequestMapping("/users")
class UserController(
    val userService: UserService,
) {
  @GetMapping("/{id}") fun getUser(@PathVariable id: Long): UserDto = userService.getUser(id)

  @PostMapping()
  @ResponseStatus(HttpStatus.OK)
  fun createUser(@Validated @RequestBody createUserDto: CreateUserDto): UserDto =
      userService.createUser(createUserDto)

  @DeleteMapping("/{id}")
  @ResponseStatus(HttpStatus.OK)
  fun deleteUser(@PathVariable id: Long) = userService.deleteUser(id)
}
