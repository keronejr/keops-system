package com.keops.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.thymeleaf.spring4.SpringTemplateEngine;
import org.thymeleaf.spring4.templateresolver.SpringResourceTemplateResolver;

@Configuration
public class ConfiguracaoSpringMVC extends WebMvcConfigurerAdapter {

	@Bean
	public SpringTemplateEngine templateEngine(SpringResourceTemplateResolver resolver) {
	   resolver.setCharacterEncoding("UTF-8");
	   SpringTemplateEngine templateEngine = new SpringTemplateEngine();
	   templateEngine.setTemplateResolver(resolver);
	   return templateEngine;
	}

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
	   registry.addViewController("/").setViewName("home");
	   registry.addViewController("/home").setViewName("home");
	}
	
	@Bean
	public CharacterEncodingFilter getCharacterEncodingFilter() {

	    CharacterEncodingFilter encodingFilter = new CharacterEncodingFilter();

	    encodingFilter.setEncoding("UTF-8");
	    encodingFilter.setForceEncoding(true);

	    return encodingFilter;
	}
}
