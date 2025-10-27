package com.security.SpringSecurity.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
@EnableWebSecurity
public class Config{
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests(authz ->
             authz
                .requestMatchers("/welcome").permitAll() //.denyAll() to denyAll request
                .requestMatchers("/common").permitAll()// Public endpoint
                .anyRequest().authenticated() // Require authentication for others
             )
                .httpBasic(withDefaults()) // HTTP Basic Authentication (new syntax)
                .formLogin(withDefaults()); // Enable HTTP Basic authentication

        return http.build();
    }
}
