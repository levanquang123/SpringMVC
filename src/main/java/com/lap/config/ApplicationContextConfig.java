// package com.lap.config;

// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.ComponentScan;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.web.servlet.ViewResolver;
// import org.springframework.web.servlet.config.annotation.EnableWebMvc;
// import org.springframework.web.servlet.view.InternalResourceViewResolver;
// import org.springframework.web.servlet.view.JstlView;

// @Configuration
// @EnableWebMvc
// @ComponentScan(basePackages = "com.lap")
// public class ApplicationContextConfig {
//     @Bean
//     public ViewResolver viewResolver() {
//         InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
//         viewResolver.setViewClass(JstlView.class);
//         viewResolver.setPrefix("/WEB-INF/views/");
//         viewResolver.setSuffix(".jsp");
//         return viewResolver;
//     }
// }
