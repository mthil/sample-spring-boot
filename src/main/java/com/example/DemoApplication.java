package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

//	public static String main(String[] args) {
//		//SpringApplication.run(DemoApplication.class, args);
//	}
	public static Integer additionner(Integer valeurA,Integer valeurB) throws Exception{
		if(valeurA==null||valeurB==null){
			throw new Exception();
		}
		Integer result=valeurA+valeurB;
		return result;
	}
	public static Integer soustraire(Integer valeurA,Integer valeurB) throws Exception{
		if(valeurA==null||valeurB==null){
			throw new Exception();
		}
		Integer result=valeurA-valeurB;
		return result;
	}
	public static Integer multiplier(Integer valeurA,Integer valeurB) throws Exception{
		if(valeurA==null||valeurB==null){
			throw new Exception();
		}
		Integer result=valeurA*valeurB;
		return result;
	}
	public static float diviser(Integer valeurA,Integer valeurB) throws Exception{
		if(valeurA==null||valeurB==null){
			throw new Exception();
		}
		float result=valeurA/valeurB;
		return result;
	}
	
	
}
