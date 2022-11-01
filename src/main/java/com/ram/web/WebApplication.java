package com.ram.web;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import org.springframework.beans.factory.annotation.Autowired;

import com.ram.model.Customer;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@ComponentScan({ "com.ram.*" })
public class WebApplication implements CommandLineRunner {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    
	public static void main(String[] args) {
		SpringApplication.run(WebApplication.class, args);
	}

	@Bean
	public Docket productApi() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.ram.controller")).build();
	}
    @Override
    public void run(String... args) throws Exception {
        String sql = "SELECT * FROM customers";
        List<Customer> customers = jdbcTemplate.query(sql,
                BeanPropertyRowMapper.newInstance(Customer.class));
         
        customers.forEach(System.out :: println);
    }

}
