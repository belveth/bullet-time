package com.belveth.bullettime.domain.like.repository

import com.belveth.bullettime.domain.like.entity.LikeEntity
import java.util.Optional
import org.springframework.data.jpa.repository.JpaRepository

interface LikeRepository : JpaRepository<LikeEntity, Long> {
  fun findByTargetTypeAndTargetId(targetType: String, targetId: Long): Optional<LikeEntity>
}
