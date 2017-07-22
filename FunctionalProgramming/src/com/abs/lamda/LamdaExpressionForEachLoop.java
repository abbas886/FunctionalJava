package com.abs.lamda;

import java.util.ArrayList;
import java.util.List;

public class LamdaExpressionForEachLoop {
	
	public static void main(String[] args) {
		 
        
        List<String> list=new ArrayList<String>();  
        list.add("SP");  
        list.add("Som");  
        list.add("Abbas");  
        list.add("Rakesh");  
          
        list.forEach(  
            (n)->System.out.println(n)  
        );  
	}

}
