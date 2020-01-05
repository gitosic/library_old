package ru.library.config.application;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import javax.sql.DataSource;

@Configuration
@EnableWebMvc
@ComponentScan({ "ru.library.config", "ru.library.controllers" })
//@Import({ AppSecurityConfig.class })
public class WebConfig {
 
@Bean
 public InternalResourceViewResolver viewResolver() {
 InternalResourceViewResolver viewResolver
 = new InternalResourceViewResolver();
 viewResolver.setViewClass(JstlView.class);
 viewResolver.setPrefix("/WEB-INF/views/");
 viewResolver.setSuffix(".jsp");
 return viewResolver;
 }

 @Bean
 public DataSource getDataSource() {
  DriverManagerDataSource dataSource = new DriverManagerDataSource();
  dataSource.setUrl("jdbc:postgresql://localhost:5432/postgres?useSll=false");
  dataSource.setDriverClassName("org.postgresql.Driver");
  return dataSource;
 }

}
