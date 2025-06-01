package com.GameRunner.spring.game_runner_api.game; // notice again this is .game sub-package

public class GameRunner {
	
	private GamingConsole game;
	private SuperContraGame game1;

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
