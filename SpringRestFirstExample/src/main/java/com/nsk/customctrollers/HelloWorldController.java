package com.nsk.customctrollers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@GetMapping("/hellorestful")
	public String printMessage() {
		return "Welcome  SpringRest Application Developer";
	}

}
