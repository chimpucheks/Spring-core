package com.zensar.spring_core_demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.beans.Product;
import com.zensar.beans.Student;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");

		//Product p2 = (Product) context.getBean("p2");
		
		//context.getBean(Product.class, "p2");
		
		// Product p1=(Product)context.getBean("p1");
		
		
		Student student=context.getBean( "s1",Student.class);
		Student student1=context.getBean( "s1",Student.class);
		 
		//System.out.println(p1);
		System.out.println(student);
		System.out.println(student1);

		/*
		 * Product product=new Product(1,"lapy",40000); System.out.println( product);
		 */
		
		((AbstractApplicationContext) context).close();
	}
}
