package com.javaspringframework.learn_spring_framework_v1.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MarioGame implements GamingConsole {
	public void up() {
		System.out.println(" Jump ");
	}
	
	public void down() {
		System.out.println(" Go into the hole ");
	}
	
	public void left() {
		System.out.println(" Go back ");
	}
	
	public void right() {
		System.out.println(" Accelerate! ");
	}

	
}
