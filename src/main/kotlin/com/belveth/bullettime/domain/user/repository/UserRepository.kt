package com.belveth.bullettime.domain.user.repository

import com.belveth.bullettime.domain.user.entity.UserEntity
import org.springframework.data.jpa.repository.JpaRepository
import java.util.Optional

interface UserRepository: JpaRepository<UserEntity, Int> {
  fun getUser(id: Int): Optional<UserEntity>
}
