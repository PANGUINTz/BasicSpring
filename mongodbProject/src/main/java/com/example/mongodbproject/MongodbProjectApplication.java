package com.example.mongodbproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class MongodbProjectApplication implements CommandLineRunner{

	@Autowired
	ProductRepository productRepo;

	@Autowired
	CustomProductRepository customRepo;

	public static void main(String[] args) {SpringApplication.run(MongodbProjectApplication.class, args);}

	public void run(String ...args) throws  Exception{
		showAll();
		customRepo.updateProductPrice("dark chocolate", 44.0);
	}
	public void showAll() {
		List<Products> proList = productRepo.findAll();
		System.out.println("xxxxx products size ->" + proList.size());
		for(int i =0; i<proList.size(); i++) {
			Products pro = proList.get(i);
			System.out.println("xxxx" + pro.getTitle() + "--" + pro.getType() + "--" + pro.getPrice());
		}
	}
}
