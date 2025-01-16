package com.example.demo;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControllerMatsuoka {

	@RequestMapping("/helloMatsuoka")
	public String hello(Model model, @RequestParam("name") String name, @RequestParam("age") String age) {
		return name + "さん、" + age + "才、こんにちは";
	}
}