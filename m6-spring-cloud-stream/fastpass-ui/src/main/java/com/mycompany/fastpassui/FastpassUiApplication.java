package com.mycompany.fastpassui;

import java.util.function.Supplier;

import org.springframework.message.message;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import reactor.core.publisher.Flux;

@SpringBootApplication
public class FastpassUiApplication {

	public static void main(String[] args) {
		SpringApplication.run(FastpassUiApplication.class, args);
	}

	@Bean
	public Supplier<Fastpasstoll> generatetollchange(){

		return()-> new  Fastpasstoll("800","1001",1.05F);

	}

	@Bean
	public Supplier<Flux<Message<Fastpasstoll>>> generatethreecharges(){

		
	}



}
