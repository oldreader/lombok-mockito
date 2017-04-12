package ru.serdyuk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LombokMockitoApplication {

	private LombokMockitoApplication() {
//
	}

	public static void main(String[] args) {
		SpringApplication.run(LombokMockitoApplication.class, args);
	}
}
