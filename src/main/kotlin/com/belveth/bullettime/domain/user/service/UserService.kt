package com.belveth.bullettime.domain.user.service

import com.belveth.bullettime.domain.user.dto.UserDto
import com.belveth.bullettime.domain.user.mapper.UserMapper
import com.belveth.bullettime.domain.user.repository.UserRepository
import org.springframework.stereotype.Service

@Service
class UserService(
  val userRepository: UserRepository,
  val mapper: UserMapper,
) {
  fun getUser(id: Long): UserDto =
    userRepository.findById(id).let { mapper.dtoFromEntity(it.orElseThrow()) }
}
