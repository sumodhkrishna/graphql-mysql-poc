package com.sumodh.graphqlmysqlpoc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.sumodh.query"})
public class GraphqlMysqlPocApplication {

	public static void main(String[] args) {
		SpringApplication.run(GraphqlMysqlPocApplication.class, args);
	}

}
