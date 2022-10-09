package com.midaas.primenumber.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class PrimeNumberService {

	public List<Integer> getPrimeNumber(int from, int to) {
		List<Integer> listOfPrime = new ArrayList<>();
		for (int index = from; index <= to; index++) {
			if (checkPrime(index))
				listOfPrime.add(index);
		}
		return listOfPrime;
	}

	static boolean checkPrime(int n) {
		// Handling the edge case
		if (n == 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(n); ++i) {
			// checking the prime number
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
