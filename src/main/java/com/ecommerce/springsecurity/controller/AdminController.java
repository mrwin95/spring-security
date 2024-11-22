package com.ecommerce.springsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/admin")
public class AdminController {

    @GetMapping("/admin")
    public String zoneAdmin(){
        return "VIP";
    }

    @GetMapping("/normal")
    public String zoneNormal(){
        return "VIP";
    }
}
