package com.example.filmeteca.infra;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class ConfigSecurity {

    @Bean
    public UserDetailsService userDevelopment(){
        UserDetails userDefault = User.builder()
                .username("ad")
                .password("{noop}123")
                .roles("USER")
                .build();

        return new InMemoryUserDetailsManager(userDefault);
    }


    @Bean
    public SecurityFilterChain filtrosSeguranca(HttpSecurity http) throws Exception {
        return http
                .authorizeHttpRequests(req -> {
                    req.antMatchers("/static/**").permitAll();
                    req.anyRequest().authenticated();
                })
                .formLogin(form -> form.loginPage("/login")
                        .defaultSuccessUrl("/filmes", true)
                        .permitAll())
                .logout( logout -> logout.logoutSuccessUrl("/login?logout")
                        .permitAll())
                .rememberMe(rememberMe -> rememberMe.key("rememberMe")
                        .alwaysRemember(true)
//                                .tokenValiditySeconds(500000)
                )
                .csrf(Customizer.withDefaults())
                .build();
    }
}
