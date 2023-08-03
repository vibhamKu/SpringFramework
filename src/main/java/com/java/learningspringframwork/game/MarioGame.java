package com.java.learningspringframwork.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MarioGame  implements GamingConsole{
	
	public void upButton() {
		System.out.println("Jump");
	}
	
	public void downButton() {
		System.out.println("Go into the hole");
	}
	
	public void leftButton() {
		System.out.println("Go bakwards");
	}
	
	public void rightButton() {
		System.out.println("Go forward");
	}

}
