package cz.fairy.tales.beservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;


@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class BeServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BeServiceApplication.class, args);
	}

}
