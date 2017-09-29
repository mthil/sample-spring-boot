package com.example;



public class DemoApplication {

	public static void main(String[] args) {
		
	}
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
