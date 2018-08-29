package com.wyait.redis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableAutoConfiguration(exclude = RedisAutoConfiguration.class)
public class WyaitRedisApplication {

	public static void main(String[] args) {
		SpringApplication.run(WyaitRedisApplication.class, args);
	}
}
