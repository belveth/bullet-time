package com.belveth.bullettime.domain.like.service

import com.belveth.bullettime.domain.like.dto.CreateLikeDto
import com.belveth.bullettime.domain.like.dto.LikeDto
import com.belveth.bullettime.domain.like.mapper.LikeMapper
import com.belveth.bullettime.domain.like.repository.LikeRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class LikeService(
    val likeRepository: LikeRepository,
    val mapper: LikeMapper,
) {
  fun getLike(id: Long): LikeDto =
      likeRepository.findById(id).let { mapper.dtoFromEntity(it.orElseThrow()) }

  @Transactional
  fun createLike(createLikeDto: CreateLikeDto): LikeDto {
    // check target's like is already present.
    likeRepository.findByTarget(createLikeDto.targetType, createLikeDto.targetId).ifPresent {
      // TODO: throw error
    }

    return mapper.dtoFromEntity(likeRepository.save(mapper.toEntityFromDto(createLikeDto)))
  }

  @Transactional fun deleteLike(id: Long) = likeRepository.deleteById(id)
}
