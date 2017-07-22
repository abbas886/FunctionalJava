package com.abs.lamda;

interface Message
{
	public String say();
	
}

public class LamdaExpressionNoParameter { 
	public static void main(String[] args) {  
		Message m=()->{  
	        return "Hello from stackroute.";  
	    };  
	    System.out.println(m.say());  
	}  }
