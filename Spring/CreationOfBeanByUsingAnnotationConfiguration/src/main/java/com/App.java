package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new AnnotationConfigApplicationContext(EmployeeDetails.class);
    	String[] beanDefinitionNames = context.getBeanDefinitionNames();
    	for (String s: beanDefinitionNames) {
    		System.out.println(s);
    	}
    	EmployeeDetails employeeDetails = context.getBean(EmployeeDetails.class);
    	employeeDetails.displayEmployeeDetails();
    }
}
