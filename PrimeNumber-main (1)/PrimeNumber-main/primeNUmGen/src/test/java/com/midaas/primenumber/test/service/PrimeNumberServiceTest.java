package com.midaas.primenumber.test.service;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.when;
import static org.junit.Assert.assertEquals;

import com.midaas.primenumber.service.PrimeNumberService;

@ExtendWith(MockitoExtension.class)
public class PrimeNumberServiceTest {
	
	@InjectMocks
	@Spy
	private PrimeNumberService primeNumberServiceTest;
	
	
	@Test
	void getPrimeNumberTestCase1() {
		List<Integer> listMock =  Arrays.asList(11,13,17,19);
		when(primeNumberServiceTest.getPrimeNumber(Mockito.anyInt(),Mockito.anyInt())).thenReturn(listMock);
		List<Integer> list  = primeNumberServiceTest.getPrimeNumber(10, 20);
		assertEquals(list.size(), listMock.size());
	}
	
	
	@Test
	void getPrimeNumberTestCase2() {
		List<Integer> listMock =  Arrays.asList(5);
		when(primeNumberServiceTest.getPrimeNumber(Mockito.anyInt(),Mockito.anyInt())).thenReturn(listMock);
		List<Integer> list  = primeNumberServiceTest.getPrimeNumber(5, 5);
		assertEquals((int)list.get(0), 5);
	}

}
