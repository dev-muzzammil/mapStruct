package com.example.mapStructBasicDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = "com.example.mapStrcutBasic.Entity")
@EnableJpaRepositories("com.example.mapStrcutBasic.Repo")
@ComponentScan({"com.example.mapStrcutBasic.Entity", "com.example.mapStrcutBasic.DTO", "com.example.mapStrcutBasic.Repo", 
				"com.example.mapStrcutBasic.Service" , "com.example.mapStrcutBasic.ServiceImpl" , "com.example.mapStrcutBasic.Mapper" ,
					"com.example.mapStrcutBasic.Controller"})

public class MapStructBasicDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MapStructBasicDemoApplication.class, args);
	}

}
