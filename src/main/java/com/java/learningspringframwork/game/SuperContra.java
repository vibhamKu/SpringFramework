package com.java.learningspringframwork.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("SuperContraQualifier")
public class SuperContra implements GamingConsole {
	
	public void upButton() {
		System.out.println("Jump up");
	}
	
	public void downButton() {
		System.out.println("Sit down");
	}
	
	public void leftButton() {
		System.out.println("Look back");
	}
	
	public void rightButton() {
		System.out.println("Shoot");
	}

}
