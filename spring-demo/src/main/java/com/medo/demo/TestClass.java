package com.medo.demo;

import com.medo.demo.entity.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;

public class TestClass {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("spring-xml.xml");
		Person person = ac.getBean(Person.class);
		System.out.println(person.getName());
	}
}
