package com.javaspringframework.learn_spring_framework_v1.a0;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan
public class SpringContextApplicationLauncher {
	
	public static void main(String[] args) {
		try(var context = new AnnotationConfigApplicationContext(SpringContextApplicationLauncher.class))
		{
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		}
		
	}
		
}
