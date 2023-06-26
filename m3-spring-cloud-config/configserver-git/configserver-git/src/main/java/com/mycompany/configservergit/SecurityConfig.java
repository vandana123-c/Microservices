package com.mycompany.configservergit;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {
    
    @Bean
    public SecurityFilterChain securityfilter(HttpSecurity http) throws Exception{
        http.authorizeRequests().anyRequest().permitAll().and().csrf(csrf->csrf.disable());
       return  http.build();
    } 
    
}
