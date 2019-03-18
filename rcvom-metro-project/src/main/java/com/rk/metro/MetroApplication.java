package com.rk.metro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
@EntityScan("com.rk.metro.entities")
public class MetroApplication {

public static void main(String[] args) {
	SpringApplication.run(MetroApplication.class, args);
}

}
