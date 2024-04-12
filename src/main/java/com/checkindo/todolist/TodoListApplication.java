package com.checkindo.todolist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.checkindo.todolist")
public class TodoListApplication {
	/**
	 * Start via Spring Boot
	 *
	 */

	public static void main(String[] args) {
		SpringApplication.run(TodoListApplication.class, args);
	}

}
