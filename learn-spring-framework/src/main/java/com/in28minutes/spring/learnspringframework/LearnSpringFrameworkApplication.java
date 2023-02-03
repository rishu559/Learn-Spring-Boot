package com.in28minutes.spring.learnspringframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.in28minutes.spring.learnspringframework.game.GameRunner;


/*
 * Iteration 1 : Tight Coupling
 * Iteration 2 : Loose coupling using interface
 * Iteration 3 : Loose Coupling using spring 
 * 
 * */
@SpringBootApplication
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(LearnSpringFrameworkApplication.class, args);
//		MarioGame game = new MarioGame(); // Iteration 1
		
//		GamingConsole game = new MarioGame(); // Iteration 2
//		GamingConsole game1 = new SuperContraGame(); // Iteration 2
//		GameRunner runner = new GameRunner(game);  
//		GameRunner runner1 = new GameRunner(game1);  
		
		GameRunner runner = context.getBean(GameRunner.class);
		runner.run(); 
		
		
//		MyWebController controller = context.getBean(MyWebController.class);
//		controller.returnFromBussinessService();
	}

}
