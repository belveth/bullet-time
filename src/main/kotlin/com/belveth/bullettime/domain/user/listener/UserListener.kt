package com.belveth.bullettime.domain.user.listener

import com.belveth.bullettime.domain.user.entity.UserEntity
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.springframework.stereotype.Component

import javax.persistence.PrePersist

@Component
class UserListener {
    @PrePersist
    fun encryptPassword(user: UserEntity) {
        val encoder = BCryptPasswordEncoder()
        user.passwordDigest = encoder.encode(user.passwordDigest)
    }
}