package com.javaspringframework.learn_spring_framework_v1.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class Pacman implements GamingConsole {
	public void up() {
		System.out.println("Moving up");
	}
	
	public void down() {
		System.out.println("Moving down");
	}
	
	public void right() {
		System.out.println("Moving right");
	}
	
	public void left() {
		System.out.println("Moving left");
	}
}
