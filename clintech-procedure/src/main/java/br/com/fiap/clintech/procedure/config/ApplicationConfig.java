package br.com.fiap.clintech.procedure.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableJpaRepositories(basePackages = "br.com.fiap.clintech.procedure.dao")
@EnableTransactionManagement
public class ApplicationConfig {

	@Bean
	public ModelMapper modelMapper() {
	    return new ModelMapper();
	}
}
