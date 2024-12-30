package com.performance.sample.repository;

import com.performance.sample.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;


public interface JpaRepositoryImpl extends JpaRepository<Member, Long> {
    Member findByName(String name);
}
