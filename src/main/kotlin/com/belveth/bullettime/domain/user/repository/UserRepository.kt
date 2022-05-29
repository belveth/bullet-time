package com.belveth.bullettime.domain.user.repository

import com.belveth.bullettime.domain.user.entity.UserEntity
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository : JpaRepository<UserEntity, Long> {}
