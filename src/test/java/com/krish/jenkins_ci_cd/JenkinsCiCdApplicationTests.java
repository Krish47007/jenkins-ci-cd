package com.krish.jenkins_ci_cd;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@WebMvcTest
class JenkinsCiCdApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@Test
	void testGreetingEndpoint() throws Exception {
		String name = "Krish";
		mockMvc.perform(MockMvcRequestBuilders.get("/greetings/{name}",name))
				.andExpect(MockMvcResultMatchers.status().isOk())
				.andExpect(MockMvcResultMatchers.content()
						.string("Hii "+name +", Congrats!!!! You have successfully configured Jenkins CI/CD"));
	}

}
