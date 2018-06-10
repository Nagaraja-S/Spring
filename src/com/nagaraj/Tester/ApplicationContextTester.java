package com.nagaraj.Tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nagaraj.spring.Shape;

public class ApplicationContextTester {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		Shape shape = (Shape) context.getBean("triangle",Shape.class);
		
		System.out.println("Shape Bean "+shape.getName() +"  "+shape.getSize());
		
		System.out.println("The Shape Dependant Dimension Left is"+shape.getDimension().getLeft()+
				" Right is "+shape.getDimension().getRight());
			
	}
}
