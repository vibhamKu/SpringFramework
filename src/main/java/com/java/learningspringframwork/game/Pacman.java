package com.java.learningspringframwork.game;

import org.springframework.stereotype.Component;

@Component
public class Pacman implements GamingConsole {
	
	public void upButton() {
		System.out.println("up");
	}
	
	public void downButton() {
		System.out.println("down");
	}
	
	public void leftButton() {
		System.out.println("left");
	}
	
	public void rightButton() {
		System.out.println("right");
	
	}

}
