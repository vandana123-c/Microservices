package com.mycompany.SecureUI;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.oauth2.client.registration.ClientRegistrationRepository;
import org.springframework.security.oauth2.client.web.OAuth2AuthorizedClientRepository;
import org.springframework.security.oauth2.client.web.reactive.function.client.ServletOAuth2AuthorizedClientExchangeFilterFunction;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import org.springframework.web.reactive.function.client.WebClient;


@Configuration
@EnableWebSecurity
public class SecurityConfig {

     @Bean
    public SecurityFilterChain filterchain(HttpSecurity http) throws Exception{
        http.authorizeRequests((authorize)-> authorize.requestMatchers(new AntPathRequestMatcher("/")).permitAll().anyRequest().
        authenticated()).oauth2Login(customizer->Customizer.withDefaults());
        //

        return http.build();

    }



    @Bean
    public WebClient webclient(ClientRegistrationRepository repo,OAuth2AuthorizedClientRepository authrepo){
    
    ServletOAuth2AuthorizedClientExchangeFilterFunction aouth= new 
    ServletOAuth2AuthorizedClientExchangeFilterFunction(repo,authrepo);
    System.out.println("In web client");

    aouth.setDefaultOAuth2AuthorizedClient(true);
    return WebClient.builder().apply(aouth.oauth2Configuration()).build();

    }
    
    

    


    
}
