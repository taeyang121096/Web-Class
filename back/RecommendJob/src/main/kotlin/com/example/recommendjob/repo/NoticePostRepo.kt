package com.example.recommendjob.repo

import com.example.recommendjob.domain.NoticePost
import org.springframework.data.jpa.repository.JpaRepository

interface NoticePostRepo : JpaRepository<NoticePost, Long> {
}
