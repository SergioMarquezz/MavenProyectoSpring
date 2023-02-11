package org.mvn.spring.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class ConfigurarSeguridad{
	

	@Bean                                                             
	public UserDetailsService userDetailsService() throws Exception {
		
		//Creacion de usuarios que tendran acceso al sistema - LOGIN POR DEFAULT SPRING
		UserBuilder users = User.withDefaultPasswordEncoder();
		InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
		manager.createUser(users.username("Alberto").password("alberto123").roles("USER").build());
		manager.createUser(users.username("Sergio").password("serch123").roles("USER","ADMIN").build());
		return manager;
	}

	/*@Bean
	@Order(1)                                                        
	public SecurityFilterChain apiFilterChain(HttpSecurity http) throws Exception {
		http
			.securityMatcher("/api/**")                                   
			.authorizeHttpRequests(authorize -> authorize
				.anyRequest().hasRole("ADMIN")
			)
			.httpBasic(Customizer.withDefaults());
		return http.build();
	}*/

	@Bean                                                            
	public SecurityFilterChain formularioLogin(HttpSecurity http) throws Exception {
		
		http.
		authorizeHttpRequests().
		anyRequest().authenticated()
		.and()
		.formLogin().loginPage("/formLogin")
		.loginProcessingUrl("/autenticarUsuario")
		.permitAll();
		
		/*http
			.authorizeHttpRequests(authorize -> authorize
				.anyRequest().authenticated()
			)
			.formLogin(Customizer.withDefaults());
		return http.build();*/
		
		/*http
		.authorizeHttpRequests(authorize -> authorize
			.anyRequest().authenticated()
		)
		.formLogin().loginPage("/formLogin")
		.loginProcessingUrl("/autenticarUsuario")
		.permitAll();*/
		
		return http.build();
	}
}

