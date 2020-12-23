package com.musicmachine;

import javafx.application.Application;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MusicmachineApplication {

	public static void main(String[] args) {
		//SpringApplication.run(MusicmachineApplication.class, args);
		Application.launch(JavaFxApplication.class, args);
	}

}
