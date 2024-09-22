package com.example.demo.service;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;

@Service
public class CalculateServiceImpl implements CalculateService {

    @Override
    public BigDecimal getCalculate(BigDecimal zarplata, Integer otpusk){

        return zarplata.divide(BigDecimal.valueOf(29.3),100,RoundingMode.FLOOR).multiply(new BigDecimal(otpusk)).setScale(2,RoundingMode.FLOOR);

    }

}
