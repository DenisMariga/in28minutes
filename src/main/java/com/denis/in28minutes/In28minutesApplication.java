package com.denis.in28minutes;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class In28minutesApplication {

	public static void main(String[] args) {
		var Context = new AnnotationConfigApplicationContext(helloWorld.class);
		System.out.println(Context.getBean("hello"));
		System.out.println(Context.getBean("address"));
		System.out.println(Context.getBean("me"));
		System.out.println(Context.getBean(person.class));

		
		
	}

}
