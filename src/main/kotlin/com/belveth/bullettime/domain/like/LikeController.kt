package com.belveth.bullettime.domain.like

import com.belveth.bullettime.domain.like.dto.CreateLikeDto
import com.belveth.bullettime.domain.like.dto.LikeDto
import com.belveth.bullettime.domain.like.service.LikeService
import org.springframework.http.HttpStatus
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/likes")
class LikeController(
    val likeService: LikeService,
) {
  @GetMapping("/{id}") fun getLike(@PathVariable id: Long): LikeDto = likeService.getLike(id)

  @PostMapping()
  @ResponseStatus(HttpStatus.OK)
  fun createLike(@Validated @RequestBody createLikeDto: CreateLikeDto): LikeDto =
      likeService.createLike(createLikeDto)

  @DeleteMapping("/{id}")
  @ResponseStatus(HttpStatus.OK)
  fun deleteLike(@PathVariable id: Long) = likeService.deleteLike(id)
}
