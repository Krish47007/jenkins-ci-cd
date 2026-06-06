package com.krish.jenkins_ci_cd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JenkinsCiCdApplication {

	@GetMapping("/greetings/{name}")
	public String greetings(@PathVariable String name)
	{
		return "Hii "+name +", Congrats!!!! You have successfully configured Jenkins CI/CD";
	}


	public static void main(String[] args) {
		SpringApplication.run(JenkinsCiCdApplication.class, args);
	}

}
