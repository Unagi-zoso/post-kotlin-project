package com.kotlin.project.postsnsproject.controller

import com.kotlin.project.postsnsproject.controller.dto.PostCreateRequest
import com.kotlin.project.postsnsproject.controller.dto.PostDetailResponse
import com.kotlin.project.postsnsproject.controller.dto.PostSearchRequest
import com.kotlin.project.postsnsproject.controller.dto.PostSummaryResponse
import com.kotlin.project.postsnsproject.controller.dto.PostUpdateRequest
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.time.LocalDateTime

/**
 * @author : Unagi_zoso
 * @date : 2023-11-05
 */
@RestController
class PostController {

    @PostMapping("/posts")
    fun createPost(
        @RequestBody postCreateRequest: PostCreateRequest,
    ): Long {
        return 1L
    }

    @PutMapping("/posts/{id}")
    fun updatePost(
        @PathVariable id: Long,
        @RequestBody postUpdateRequest: PostUpdateRequest,
    ): Long {
        return id
    }

    @DeleteMapping("/posts/{id}")
    fun deletePost(
        @PathVariable id: Long,
        @RequestParam createdBy: String,
    ): Long {
        println(createdBy)
        return id
    }

    @GetMapping("/posts/{id}")
    fun getPost(
        @PathVariable id: Long,
    ): PostDetailResponse {
        return PostDetailResponse(1L, "title", "content", "createdBy", LocalDateTime.now().toString())
    }

    @GetMapping("/posts")
    fun getPostsByPage(
        pageable: Pageable,
        postSearchRequest: PostSearchRequest,
    ): Page<PostSummaryResponse> {
        return Page.empty()
    }
}
