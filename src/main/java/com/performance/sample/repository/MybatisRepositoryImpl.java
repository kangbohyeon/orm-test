package com.performance.sample.repository;

import com.performance.sample.domain.Member;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MybatisRepositoryImpl {
    void save(Member member);
}
