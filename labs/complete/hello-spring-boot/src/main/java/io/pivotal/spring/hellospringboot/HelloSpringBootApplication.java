package io.pivotal.spring.hellospringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class HelloSpringBootApplication {

	@Value("${greeting}")
	String greeting;

	@Autowired
	private GreetingService greetingService;

	@RequestMapping("/")
	public String hello() {
	    return String.format("%s World!", greetingService.getGreeting());
	}

	public static void main(String[] args) {
		SpringApplication.run(HelloSpringBootApplication.class, args);
	}

}
