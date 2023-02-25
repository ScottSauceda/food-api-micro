package com.foodie.reviewmicroservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/review")
public class ReviewController {
    @GetMapping("/message")
    public String test(){
        return "Review team. Reporting for duty.";
    }
}
