package com.GameRunner.spring.game_runner_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.GameRunner.spring.game_runner_api.game.GameRunner;
import com.GameRunner.spring.game_runner_api.game.MarioGame;
import com.GameRunner.spring.game_runner_api.game.SuperContraGame;
import com.GameRunner.spring.game_runner_api.game.PacManGame;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class GameRunnerApiApplication {

	public static void main(String[] args) {

		//MarioGame game = new MarioGame(); // cmd + 1 or ctrl + 1 (Mac or Windows) to create Mario Class
		//SuperContraGame game = new SuperContraGame();
		//PacManGame game = new PacManGame();
		//GameRunner runner = new GameRunner(game); // pass game as constructor argument

		ConfigurableApplicationContext context = SpringApplication.run(GameRunnerApiApplication.class, args);
		GameRunner runner = context.getBean(GameRunner.class); // Bean is an instant of component
		runner.run(); // allows us to run the game


		
		
		
	}// end main(String[] args)

}// end class GameRunnerApiApplication
