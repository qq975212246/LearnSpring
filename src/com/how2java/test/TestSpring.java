package com.how2java.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.how2java.service.ProductService;

public class TestSpring {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "applicationContext.xml" });

        ProductService s = (ProductService) context.getBean("s");
        s.doSomeService();

		/*
		 * Catagory c = (Catagory) context.getBean("c");
		 * 
		 * System.out.println(c.getName());
		 */

		/*
		 * Product p = (Product) context.getBean("p");
		 * 
		 * System.out.println(p.getName());
		 * System.out.println(p.getCatagory().getName());
		 */
	}

}
