package com.devy.dummy;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class FillDummyValueApplication {

	public static void main(String[] args) {
		SpringApplication.run(FillDummyValueApplication.class, args);
        log.info("hello world");
	}
}
