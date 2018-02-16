package com.abhishek.service;

import org.springframework.stereotype.Service;

/**
 * Hello world!
 *
 */

@Service
public class HomeServiceImpl implements HomeService
{
	@Override
	public String helloWorld() {
		return "Abhishek";
	}
    
}
