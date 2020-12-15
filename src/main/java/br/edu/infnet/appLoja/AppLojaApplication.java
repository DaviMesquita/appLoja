package br.edu.infnet.appLoja;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppLojaApplication {

	public static void main(String[] args) {
		//SpringApplication.run(AppLojaApplication.class, args);
		
		System.out.println(Arrays.toString(args));
	}

}
