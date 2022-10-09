package com.midaas.primenumber.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.midaas.primenumber.service.PrimeNumberService;

@RestController
public class PrimeNumberController {

	@Autowired
	private PrimeNumberService primeNumberService;

	@GetMapping("get-primenumber")
	public ResponseEntity<?> genratePrimeNumber(@RequestParam int from, @RequestParam int to) {
		List<Integer> liftOfPrimeNumber = primeNumberService.getPrimeNumber(from, to);
		return new ResponseEntity<List<Integer>>(liftOfPrimeNumber, HttpStatus.OK);
	}

}
