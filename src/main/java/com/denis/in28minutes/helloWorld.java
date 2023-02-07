package com.denis.in28minutes;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
record Address (String firstLine, String city) {};
record person(String name, int age) {};
public class helloWorld {
  @Bean
  public String hello() {
	  return"Hello World";
  }
  @Bean
  public Address address() {
	return new Address("Kenya", "Nairobi");
	  
  }
  @Bean(name="me")
  public person person() {
	  return new person("Denis", 22);
  }
}
