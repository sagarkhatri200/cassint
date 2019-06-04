package com.sagar.cassandra.cass;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.cassandra.CassandraDataAutoConfiguration;

@SpringBootApplication
public class CassApplication {

	public static void main(String[] args) {
		SpringApplication.run(CassApplication.class, args);
	}

}
