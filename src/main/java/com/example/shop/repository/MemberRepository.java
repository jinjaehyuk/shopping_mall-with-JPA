package com.example.shop.repository;

import com.example.shop.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {

    /**
     * 회원가입 시 중복된 회원이 있는지 검사하기 위해서 이메일로 회원을 검사
     * @param email
     * @return
     */
    Member findByEmail(String email);

}
