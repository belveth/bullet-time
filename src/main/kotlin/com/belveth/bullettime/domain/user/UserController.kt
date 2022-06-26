package com.belveth.bullettime.domain.user

import com.belveth.bullettime.domain.user.dto.CreateUserDto
import com.belveth.bullettime.domain.user.dto.UpdateUserDto
import com.belveth.bullettime.domain.user.dto.UserDto
import com.belveth.bullettime.domain.user.service.UserService
import org.springframework.http.HttpStatus
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.*

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

  @PutMapping("/{id}")
  @ResponseStatus(HttpStatus.OK)
  fun updateUser(@PathVariable id: Long, @Validated @RequestBody updateUserDto: UpdateUserDto): UserDto =
      userService.updateUser(id, updateUserDto)

  @DeleteMapping("/{id}")
  @ResponseStatus(HttpStatus.OK)
  fun deleteUser(@PathVariable id: Long) = userService.deleteUser(id)
}
