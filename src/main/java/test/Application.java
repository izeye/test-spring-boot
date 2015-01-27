package test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by izeye on 15. 1. 28..
 */
@SpringBootApplication
public class Application implements CommandLineRunner {

	@Value("${something}")
	private String something;

	@Override
	public void run(String... args) throws Exception {
		System.out.println(something);
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
