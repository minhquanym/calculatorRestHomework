package com.example.calculatorrest;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
	@GetMapping("/calculate")
	public Calculation calculate(
        @RequestParam(value = "num0") Double num0,
        @RequestParam(value = "num1") Double num1,
        @RequestParam(value = "operator") String operator
    ) {
		return new Calculation(num0, num1, operator);
	}
}