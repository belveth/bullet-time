package com.belveth.bullettime.domain.post.service

import com.belveth.bullettime.domain.post.dto.CreatePostDto
import com.belveth.bullettime.domain.post.dto.PostDto
import com.belveth.bullettime.domain.post.mapper.PostMapper
import com.belveth.bullettime.domain.post.repository.PostRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class PostService(
    val postRepository: PostRepository,
    val mapper: PostMapper,
) {
  fun getPost(id: Long): PostDto =
      postRepository.findById(id).let { mapper.dtoFromEntity(it.orElseThrow()) }

  @Transactional
  fun createPost(createPostDto: CreatePostDto): PostDto {
    return mapper.dtoFromEntity(postRepository.save(mapper.toEntityFromDto(createPostDto)))
  }

  @Transactional
  fun deletePost(id: Long) = postRepository.deleteById(id)
}
