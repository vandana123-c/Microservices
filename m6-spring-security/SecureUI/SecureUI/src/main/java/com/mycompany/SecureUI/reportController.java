package com.mycompany.SecureUI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Flux;

@Controller
public class reportController {

@Autowired
SecurityConfig config;
   
@RequestMapping("/")
    public String homeget(){
        return "Home";
    }

    @RequestMapping("/report")
    public String getreports(Model m){
        return "report";

     //Flux<Tolldata>  response =this..WebClient.get().uri("http://localhost:8089/tolldata").return();
    }


    
}
