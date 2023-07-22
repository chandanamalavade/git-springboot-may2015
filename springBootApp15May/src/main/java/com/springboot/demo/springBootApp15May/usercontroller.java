package com.springboot.demo.springBootApp15May;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class usercontroller {
@GetMapping("/helloworld")
public String sayHelloWorld() 
{
	return "Hello world from string boot";
}
}
