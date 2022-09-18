package com.belveth.bullettime.domain.auth.service

import org.springframework.stereotype.Service

@Service
class AuthService() {
  fun serialize(id: Long): String = "temp"

  fun deserialize(authToken: String): Long = 1
}
