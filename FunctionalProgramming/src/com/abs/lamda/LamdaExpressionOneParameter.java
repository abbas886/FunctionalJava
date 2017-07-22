package com.abs.lamda;

interface Hello {
	public String say(String name);

}

public class LamdaExpressionOneParameter {
	public static void main(String[] args) {

		// Lambda expression with single parameter.
		Hello s1 = (name) -> {
			return "Hello, " + name;
		};
		System.out.println(s1.say("NIIT"));

		// You can omit function parentheses
		Hello s2 = name -> {
			return "Hello, " + name;
		};
		System.out.println(s2.say("NIIT"));
	}
}
