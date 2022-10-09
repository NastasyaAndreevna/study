package com.example.demo;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Привет, это калькулятор отпускных.");
		
		System.out.println("Введите вашу среднюю зарплату за 12 месяцев:");
		float a = scan.nextFloat();
		
		System.out.println("Сколько дней будете в отпуске?");
		float b = scan.nextFloat();
		
		float c = a / 29.3f * b;
		
		System.out.print("Размер ваших отпускных составит: ");
		System.out.printf("%.2f",c);
		System.out.print(" руб.");
		
	}

}
