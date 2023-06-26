package com.mycompany.Webfunction;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class WebFunctionApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebFunctionApplication.class, args);
	}

	List<TollStation> tollstation;

	public WebFunctionApplication(){

		tollstation =new ArrayList<>();

		tollstation.add(new TollStation("100A",112.5f,2));
		tollstation.add(new TollStation("111C",125f,4));
		tollstation.add(new TollStation("100A",113f,1));

	}

	@Bean
	public Function<String,TollStation>  retrievestation(){
		
		return value->{
			 System.out.println("the value is"+ value);
			

		return tollstation.stream().filter(toll-> value.equals(toll.stationid)).findAny().orElse(null);
		};


	}

@Bean
	public Consumer<TollRecord>  processtollrecord(){

		return value->{
			 System.out.println("the record value is "+ value.getLicenseplate());
		};
          
	}





}
