package com.performance.sample.service;


import com.performance.sample.domain.Member;
import com.performance.sample.repository.JdbcRepositoryImpl;
import com.performance.sample.repository.JpaRepositoryImpl;
import com.performance.sample.repository.MybatisRepositoryImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;



@Log4j2
@Service
@RequiredArgsConstructor
public class PerformanceServiceImpl implements PerformanceService {
//    private final JpaRepositoryImpl performanceRepository;
//    private final JdbcRepositoryImpl performanceRepository;
    private final MybatisRepositoryImpl performanceRepository;

    @Override
    public void insert() {
        log.info("start performance test");

        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            Member member = Member.signup("test" + i);
            performanceRepository.save(member);
        }

        long endTime = System.currentTimeMillis();
        log.info("total time : {}", endTime - startTime);
    }
}
