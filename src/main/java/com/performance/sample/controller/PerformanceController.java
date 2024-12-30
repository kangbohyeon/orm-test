package com.performance.sample.controller;


import com.performance.sample.service.PerformanceService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@Log4j2
@RestController
@RequiredArgsConstructor
public class PerformanceController {
    private final PerformanceService performanceService;

    @PostMapping("/")
    public ResponseEntity insert() {

        performanceService.insert();
        HashMap<String, String> response = new HashMap<>();
        response.put("result", "00");
        response.put("resultMessage", "success");

        return ResponseEntity.ok().body(response);
    }

}
