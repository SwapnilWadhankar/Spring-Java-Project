package com.javaspringframework.learn_spring_framework_v1.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("SuperContraQualifier")
public class SuperContra implements GamingConsole {
	public void up() {
		System.out.println("Look Up");
	}
	
	public void down() {
		System.out.println("Crouch Down");
	}
	
	public void left() {
		System.out.println("Step Back");
	}
	
	public void right() {
		System.out.println("Fire");
	}
}
