package com.java.learningspringframwork.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.java.learningspringframwork.game")
public class GamingAppLauncherApplication {

	public static void main(String[] args) {
		
		try(var context = 
				new AnnotationConfigApplicationContext(GamingAppLauncherApplication.class)) {
			
			context.getBean(GamingConsole.class).upButton();
			
			context.getBean(GameRunner.class).run();
		}

		//var game = new MarioGame();
//		//var game = new SuperContra();
//		var game = new Pacman();
//		var gameRunner = new GameRunner(game);
//		
//		gameRunner.run();

	}

}
