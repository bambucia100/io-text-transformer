package pl.put.poznan.ioprojectarchitecture;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"pl.put.poznan.ioprojectarchitecture.rest"})
public class IoProjectArchitectureApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(IoProjectArchitectureApplication.class, args);
		
	   
	}
}
