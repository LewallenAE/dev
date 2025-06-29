package com.GameRunner.spring.game_runner_api.game; // notice this package has .game at the end
// this makes it a sub-package of the com.GameRunner.spring.game_runner_api package


import org.springframework.stereotype.Component;

@Component
public class SuperContraGame implements GamingConsole { // this is considered tightly coupled code
	
	public void up() {
		System.out.println("SuperContraGame Jump");
	}
	
	public void down() {
		System.out.println("SuperContraGame Down into a hole");
	}
	
	public void left() {
		System.out.println("SuperContraGame Stop");
	}
	
	public void right() {
		System.out.println("SuperContraGame Accelerate");
	}

}
