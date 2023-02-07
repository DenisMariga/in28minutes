package com.denis.in28minutes;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class In28minutesApplication {

	public static void main(String[] args) {
		var Context = new AnnotationConfigApplicationContext(helloWorld.class);
		System.out.println(Context.getBean("hello"));
		System.out.println(Context.getBean("address"));
		System.out.println(Context.getBean("me"));
		System.out.println(Context.getBean(person.class));
        System.out.println(Context.getBean(person.class));
		Arrays.stream(Context.getBeanDefinitionNames()).forEach(System.out::println);
		
	}

}
