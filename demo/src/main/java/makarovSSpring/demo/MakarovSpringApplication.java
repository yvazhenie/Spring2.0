package makarovSSpring.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MakarovSpringApplication {

	public static void main(String[] args) {
		System.setProperty("server.servlet.context-path", "/store");
		SpringApplication.run(MakarovSpringApplication.class, args);
	}

}
