package com.belveth.bullettime.domain.post

import com.belveth.bullettime.domain.post.dto.CreatePostDto
import com.belveth.bullettime.domain.post.dto.PostDto
import com.belveth.bullettime.domain.post.service.PostService
import org.springframework.http.HttpStatus
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.DeleteMapping

@RestController
@RequestMapping("/posts")
class PostController(
    val postService: PostService,
) {
  @GetMapping("/{id}") fun getPost(@PathVariable id: Long): PostDto = postService.getPost(id)

  @PostMapping()
  @ResponseStatus(HttpStatus.OK)
  fun createPost(@Validated @RequestBody createPostDto: CreatePostDto): PostDto =
      postService.createPost(createPostDto)

  @DeleteMapping("/{id}")
  @ResponseStatus(HttpStatus.OK)
  fun deletePost(@PathVariable id: Long) = postService.deletePost(id)
}
