package com.jpabook.jpashop;


import com.jpabook.jpashop.domain.Member;
import org.springframework.stereotype.Repository;

import javax.persistence.PersistenceContext;
import javax.persistence.EntityManager;

@Repository
public class MemberRepository {

    @PersistenceContext
    //그리들 spring-boot-stater-data-jpa 등록하면 EntityManager 생성 자동으로 되서 안해도 쓸수 있음. 팩토리같은거 자동으로 생성
    private EntityManager em;

    public Long save(Member member) {
        em.persist(member);
        return member.getId();
    }

    public Member find(Long id) {
        return em.find(Member.class, id);
    }

}
