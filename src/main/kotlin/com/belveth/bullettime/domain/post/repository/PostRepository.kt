package com.belveth.bullettime.domain.post.repository

import com.belveth.bullettime.domain.post.entity.PostEntity
import java.util.Optional
import org.springframework.data.jpa.repository.JpaRepository

interface PostRepository : JpaRepository<PostEntity, Long> {
  fun findByEmail(email: String): Optional<PostEntity>
}
