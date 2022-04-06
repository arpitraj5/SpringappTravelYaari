package com.examly.springapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;


@SpringBootApplication
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class SpringappApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringappApplication.class, args);
	}
}
// package com.examly.springapp;

// import org.springframework.boot.SpringApplication;
// import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.web.bind.annotation.CrossOrigin;
// // @CrossOrigin
// @CrossOrigin(origins = "*")
// @SpringBootApplication
// public class SpringappApplication {

// 	public static void main(String[] args) {
// 		SpringApplication.run(SpringappApplication.class, args);
// 	}

// }
