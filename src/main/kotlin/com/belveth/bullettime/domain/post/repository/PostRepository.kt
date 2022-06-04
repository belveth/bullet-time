package com.belveth.bullettime.domain.post.repository

import com.belveth.bullettime.domain.post.entity.PostEntity
import java.util.Optional
import org.springframework.data.jpa.repository.JpaRepository

interface PostRepository : JpaRepository<PostEntity, Long> {
  fun findByCategoryId(id: Long): Optional<PostEntity>
  fun findByLocationId(id: Long): Optional<PostEntity>
  fun findByUserId(id: Long): Optional<PostEntity>
}
