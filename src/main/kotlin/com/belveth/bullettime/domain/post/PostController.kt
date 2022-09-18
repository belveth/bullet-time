package com.belveth.bullettime.domain.post

import com.belveth.bullettime.domain.post.dto.CreatePostDto
import com.belveth.bullettime.domain.post.dto.PostDto
import com.belveth.bullettime.domain.post.dto.UpdatePostDto
import com.belveth.bullettime.domain.post.service.PostService
import com.belveth.bullettime.domain.auth.service.AuthService
import com.belveth.bullettime.domain.user.service.UserService
import org.springframework.http.HttpStatus
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/posts")
class PostController(
        val postService: PostService,
        val authService: AuthService,
        val userService: UserService,
) {
    @GetMapping("/{id}")
    fun getPost(
        @PathVariable id: Long,
        @RequestHeader("Auth-Token") authToken: String
    ): PostDto {
        val userId = authService.deserialize(authToken)
        val currentUser = userService.getUser(userId)
        println(currentUser)
        return postService.getPost(id)
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.OK)
    fun createPost(@Validated @RequestBody createPostDto: CreatePostDto): PostDto =
            postService.createPost(createPostDto)

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    fun updatePoset(
            @PathVariable id: Long,
            @Validated @RequestBody updatePostDto: UpdatePostDto
    ): PostDto = postService.updatePost(id, updatePostDto)

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    fun deletePost(@PathVariable id: Long) = postService.deletePost(id)
}
