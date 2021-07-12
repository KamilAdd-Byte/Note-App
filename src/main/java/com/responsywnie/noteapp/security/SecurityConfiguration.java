package com.responsywnie.noteapp.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableGlobalMethodSecurity(securedEnabled = true)
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
    @Autowired
    public void configureAuth(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("Kasia").password("{noop}mysza300").roles("USER","ADMIN")
                .and()
                .withUser("Kamil").password("{noop}mysza300").roles("USER","ADMIN")
                .and()
                .withUser("user222").password("{noop}user222").roles("USER","ADMIN");
    }
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
//               .antMatchers("/","/showNewNoteForm","/about","/assets/**").permitAll()
                .antMatchers("/**","/showNewNoteForm").hasRole("ADMIN")
                .antMatchers("/**","/showNewNoteForm").hasRole("USER")
                .anyRequest().authenticated()
                .and().formLogin().defaultSuccessUrl("/")
                .and().logout().logoutSuccessUrl("/");
    }
}
