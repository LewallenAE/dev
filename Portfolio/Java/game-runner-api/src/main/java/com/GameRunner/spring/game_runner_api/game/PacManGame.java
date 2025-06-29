package com.GameRunner.spring.game_runner_api.game;


import org.springframework.stereotype.Component;

//@Component
public class PacManGame implements GamingConsole{

    public void up() {
        System.out.println("PacMan Moves up");
    }

    public void down() {
        System.out.println("PacMan Moves down");
    }

    public void left() {
        System.out.println("PacMan Moves left");
    }

    public void right() {
        System.out.println("PacMan Moves right");
    }
}
