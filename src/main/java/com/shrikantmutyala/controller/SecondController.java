package com.shrikantmutyala.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/consumer")
public class SecondController {

	@GetMapping("/message")
	public String test(@RequestHeader("second-request") String header) {
		System.out.println(header);
		return "Hello JavaInUse Called in second Service";
	}

}
