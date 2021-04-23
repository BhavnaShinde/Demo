package com.cg.grocerydeliveryapplication;

import static springfox.documentation.builders.PathSelectors.regex;

import java.util.function.Predicate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@SpringBootApplication
@EnableOpenApi
public class GroceryDeliveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(GroceryDeliveryApplication.class, args);
	}
	@Bean
	  public Docket openApiPayment() {
	    return new Docket(DocumentationType.OAS_30)
	        .groupName("open-api-grocery-store")
	        .select()
	        .paths(paymentPaths())
	        .build();
	  }
	/**
	 * 
	 * @return regex
	 */

	  private Predicate<String> paymentPaths() {
	    return regex(".*/api/payments/.*");
	  }

}
