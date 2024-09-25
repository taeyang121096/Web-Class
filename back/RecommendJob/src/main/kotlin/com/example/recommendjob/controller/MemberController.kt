package com.example.recommendjob.controller

import com.example.recommendjob.domain.Member
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/members")
class MemberController {

    @GetMapping
    fun getAllMembers(): List<Member> {
        return listOf(
            Member(1, "Alice", ""))
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun createMember(@RequestBody member: Member): Member {
        return member
    }

    @GetMapping("/{id}")
    fun getMemberById(@PathVariable id: Long): Member {
        return Member(id, "Alice", "")
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun deleteMemberById(@PathVariable id: Long) {
    }

}
