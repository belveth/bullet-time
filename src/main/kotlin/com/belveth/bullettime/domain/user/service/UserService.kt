package com.belveth.bullettime.domain.user.service

import com.belveth.bullettime.domain.user.dto.CreateUserDto
import com.belveth.bullettime.domain.user.dto.UserDto
import com.belveth.bullettime.domain.user.mapper.UserMapper
import com.belveth.bullettime.domain.user.repository.UserRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class UserService(
    val userRepository: UserRepository,
    val mapper: UserMapper,
) {
  fun getUser(id: Long): UserDto =
      userRepository.findById(id).let { mapper.dtoFromEntity(it.orElseThrow()) }

  @Transactional
  fun createUser(createUserDto: CreateUserDto): UserDto {
    userRepository.findByEmail(createUserDto.email!!).ifPresent {
      // TODO: throw error
    }

    return mapper.dtoFromEntity(userRepository.save(mapper.toEntityFromDto(createUserDto)))
  }

  @Transactional
  fun deleteUser(id: Long) = userRepository.deleteById(id)
}
