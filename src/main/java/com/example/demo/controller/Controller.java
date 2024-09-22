package com.example.demo.controller;


import com.example.demo.service.CalculateService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;


@RestController
@RequestMapping
public class Controller {

    CalculateService service;

    public Controller(CalculateService service) {
        this.service = service;
    }

    @GetMapping("/calculacte")
    BigDecimal getCalculate(@RequestParam BigDecimal zarplata, @RequestParam Integer otpusk){
        return service.getCalculate(zarplata, otpusk);
    }

}
