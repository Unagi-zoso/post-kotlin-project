package com.kotlin.project.postsnsproject.controller.dto

/**
 * @author : Unagi_zoso
 * @date : 2023-11-05
 */
data class PostCreateRequest(
    val title: String,
    val content: String,
    val createdBy: String,
)
