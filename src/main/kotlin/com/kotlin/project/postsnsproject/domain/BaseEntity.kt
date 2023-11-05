package com.kotlin.project.postsnsproject.domain

import jakarta.persistence.MappedSuperclass
import java.time.LocalDateTime

/**
 * @author : Unagi_zoso
 * @date : 2023-11-05
 */
@MappedSuperclass
abstract class BaseEntity(
    createdBy: String,
) {
    val createdBy: String = createdBy
    val createdAt: LocalDateTime = LocalDateTime.now()
    var updatedBy: String? = null
        protected set
    var updatedAt: LocalDateTime? = null
        protected set

    fun update(updatedBy: String) {
        this.updatedBy = updatedBy
        this.updatedAt = LocalDateTime.now()
    }
}
