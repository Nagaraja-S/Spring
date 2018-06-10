package com.nagaraj.Tester;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nagaraj.spring.Shape;

/**
 * XmlBeanFactory is Deprecated
 * 
 */
public class Test {
	
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
	
		
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("/home/nagaraj/Spring-Workspace/SrpingHelloWorld/src/beans.xml"));
		
		Shape shape = (Shape) factory.getBean("triangle",Shape.class);
		
		System.out.println("The Shape is :"+shape.getName());
		
		System.out.println("The Shape Size is :"+shape.getSize());
		
	} 

}
