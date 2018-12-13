package pl.put.poznan.ioprojectarchitecture;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"pl.put.poznan.ioprojectarchitecture.rest"})
public class IoProjectArchitectureApplication {

	public static void main(String[] args) {
		SpringApplication.run(IoProjectArchitectureApplication.class, args);
	}
}
