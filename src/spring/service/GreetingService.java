package spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.lang.Language;

@Service
public class GreetingService {
	@Autowired
	private Language en;

	public GreetingService() {

	}

	public void sayGreeting() {
		System.out.println(en.getGreeting());
	}
}
