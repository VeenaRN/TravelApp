package coms.MongoDbwithRestApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import coms.MongoDbwithRestApi.entities.Cricket;

@SpringBootApplication
public class MongoDbwithRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MongoDbwithRestApiApplication.class, args);
		System.out.println("Mongo db......");
		Cricket crk=new Cricket(1001, "Dhoni", "One-Day", 20000);
		System.out.println("Cricket number :"+crk.getCrkno());
		System.out.println("Cricket number :"+crk.getCrkname());
		System.out.println("Cricket number :"+crk.getGametype());
		System.out.println("Cricket number :"+crk.getRuns());
	}

}
