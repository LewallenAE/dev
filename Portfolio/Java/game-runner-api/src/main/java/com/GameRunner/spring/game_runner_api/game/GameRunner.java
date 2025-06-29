package com.GameRunner.spring.game_runner_api.game; // notice again this is .game sub-package


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {

	@Autowired
	private GamingConsole game;

	public GameRunner(GamingConsole game) {
		// TODO Auto-generated constructor stub
		
		this.game = game;
		
		
		
	}

	public void run() {
		game.up();
		game.down();
		game.left();
		game.right();
		
		
		
		
		
	}
}
