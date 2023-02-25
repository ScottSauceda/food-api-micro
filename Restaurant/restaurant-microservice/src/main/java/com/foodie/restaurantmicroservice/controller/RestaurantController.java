package com.foodie.restaurantmicroservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/restaurant")
public class RestaurantController {
    @GetMapping("/message")
    public String test(){
        return "Restaurant team. Reporting for duty.";
    }
}
