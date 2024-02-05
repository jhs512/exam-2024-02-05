package com.ll.exam20240205.domain.home.home.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class HomeController {
    @GetMapping("/")
    public String home() {
        return "home";
    }
}
