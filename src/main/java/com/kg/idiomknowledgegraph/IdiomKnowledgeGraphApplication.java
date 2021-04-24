package com.kg.idiomknowledgegraph;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.kg.idiomknowledgegraph.dao"})
public class IdiomKnowledgeGraphApplication {
	public static void main(String[] args) {
		SpringApplication.run(IdiomKnowledgeGraphApplication.class, args);
	}

}
