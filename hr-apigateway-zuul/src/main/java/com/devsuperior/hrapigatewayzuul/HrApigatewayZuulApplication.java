package com.devsuperior.hrapigatewayzuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.codec.ServerCodecConfigurer;

@EnableEurekaClient
@EnableZuulProxy
@SpringBootApplication
@Configuration
public class HrApigatewayZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(HrApigatewayZuulApplication.class, args);
	}

	@Bean
	public ServerCodecConfigurer serverCodecConfigurer() {
	   return ServerCodecConfigurer.create();
	}
}
