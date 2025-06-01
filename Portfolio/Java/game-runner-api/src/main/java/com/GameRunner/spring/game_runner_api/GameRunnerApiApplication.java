package com.GameRunner.spring.game_runner_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.GameRunner.spring.game_runner_api.game.GameRunner;
import com.GameRunner.spring.game_runner_api.game.MarioGame;
import com.GameRunner.spring.game_runner_api.game.SuperContraGame;

@SpringBootApplication
public class GameRunnerApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(GameRunnerApiApplication.class, args);
		
		//MarioGame game = new MarioGame(); // cmd + 1 or ctrl + 1 (Mac or Windows) to create Mario Class
		
		SuperContraGame game = new SuperContraGame();
		GameRunner runner = new GameRunner(game); // pass game as constructor argument
		runner.run(); // allows us to run the game
		
		
		
	}// end main(String[] args)

}// end class GameRunnerApiApplication
