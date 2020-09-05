package com.telstra.pack1;

public class Single {

		   //create an object of SingleObject
		   private static Single instance = new Single();

		   //make the constructor private so that this class cannot be
		   //instantiated
		   private Single(){}

		   //Get the only object available
		   public static Single getInstance(){
		      return instance;
		   }

		   public void show(){
		      System.out.println("Hello, How are you!!!");
		   }
		}

