package com.example.demo;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloTest {
	@RequestMapping("/hellotest")
	public String hello(Model model) {
		return "helloTest";
	}
}
