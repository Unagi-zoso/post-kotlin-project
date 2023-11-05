package com.kotlin.project.postsnsproject.domain

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

/**
 * @author : Unagi_zoso
 * @date : 2023-11-05
 */
@Entity
class Post(
    createdBy: String = "",
    title: String = "",
    content: String = "",
) : BaseEntity(createdBy) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0L

    var title: String = title
        protected set
    var content: String = content
        protected set
}
