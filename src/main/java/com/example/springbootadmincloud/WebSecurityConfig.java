package com.example.springbootadmincloud;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;


@Configuration
public class WebSecurityConfig {

    @Bean
    protected SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

        http
                .formLogin()
                .loginPage("/login")
                .permitAll();
        http
                .logout().logoutUrl("/logout").permitAll();
        http.csrf()
                .ignoringAntMatchers("/actuator/**", "/instances/**", "/logout");
        http
                .authorizeRequests()
                .antMatchers("/**/*.css", "/assets/**", "/third-party/**", "/logout", "/login")
                .permitAll();
        http
                .authorizeRequests()
                .anyRequest()
                .authenticated();
        http.httpBasic(); // Activate Http basic Auth for the server

        return http.build();
    }
}
