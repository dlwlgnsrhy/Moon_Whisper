package com.app.alpha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.app.alpha.entity")
public class MoonWhisperApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoonWhisperApplication.class, args);
	}

}
